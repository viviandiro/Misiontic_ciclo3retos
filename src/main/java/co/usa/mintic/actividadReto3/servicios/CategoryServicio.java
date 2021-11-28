/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;

import co.usa.mintic.actividadReto3.modelo.crud.CategoryRepositorio;
import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import co.usa.mintic.actividadReto3.modelo.entidades.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ViviJhon
 */
@Service
public class CategoryServicio extends ServicioGenericoAbstracto<Category, Integer> {

    @Autowired
    private CategoryRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Category, Integer> getRepository() {
        return repositorio;
    }

    @Override
    public Category guardar(Category objeto) {
        if (objeto.getId() == null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Category> c = obtenerXId(objeto.getId());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Category actualizar(Category objeto) {
        if (objeto.getId() != null) {
            Optional<Category> c = obtenerXId(objeto.getId());
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
