/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;

/**
 *
 * @author ViviJhon
 */
import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class ServicioGenericoAbstracto<T, ID extends Serializable> {

    public abstract RepositorioGenericoAbstracto<T, ID> getRepository();

    public abstract T guardar(T objeto);

    public abstract T actualizar(T objeto);

    public List<T> obtenerTodos() {
        return getRepository().obtenerTodos();
    }

    public Optional<T> obtenerXId(ID id) {
        return getRepository().obtenerXId(id);
    }

    public boolean eliminar(ID id) {
        return obtenerXId(id).map(t -> {
            getRepository().eliminar(id);
            return true;
        }).orElse(false);
    }
}
