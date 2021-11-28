/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;

import co.usa.mintic.actividadReto3.modelo.crud.LibraryRepositorio;
import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import co.usa.mintic.actividadReto3.modelo.entidades.Library;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ViviJhon
 */
@Service
public class LibraryServicio extends ServicioGenericoAbstracto<Library, Integer> {

    @Autowired
    private LibraryRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Library, Integer> getRepository() {
        return repositorio;
    }

    @Override
    public Library guardar(Library objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Library> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Library actualizar(Library objeto) {
        if (objeto.getId() != null) {
            Optional<Library> c = obtenerXId(objeto.getId());
            if (!c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        } else {
            return objeto;
        }
    }
}
