/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.modelo.crud;

import co.usa.mintic.actividadReto3.modelo.crud.interfaz.InterfaceGenerica;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ViviJhon
 */
public abstract class RepositorioGenericoAbstracto<T, ID extends Serializable> implements InterfaceGenerica<T, ID> {

    public abstract CrudRepository<T, ID> getDao();

    @Override
    public List<T> obtenerTodos() {
        return (List<T>) getDao().findAll();
    }

    @Override
    public Optional<T> obtenerXId(ID id) {
        return getDao().findById(id);
    }

    @Override
    public T guardar(T objecto) {
        return getDao().save(objecto);
    }

    @Override
    public void eliminar(ID id) {
        getDao().deleteById(id);
    }
}
