/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.modelo.crud;

import co.usa.mintic.actividadReto3.modelo.crud.interfaz.LibraryInterface;
import co.usa.mintic.actividadReto3.modelo.entidades.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ViviJhon
 */
@Repository
public class LibraryRepositorio extends RepositorioGenericoAbstracto<Library, Integer> {

    @Autowired
    private LibraryInterface anInterface;

    @Override
    public CrudRepository<Library, Integer> getDao() {
        return anInterface;
    }

}
