/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;

import co.usa.mintic.actividadReto3.modelo.crud.AdminRepositorio;
import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import co.usa.mintic.actividadReto3.modelo.entidades.Admin;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ViviJhon
 */
@Service
public class AdminServicio extends ServicioGenericoAbstracto<Admin, Integer> {

    @Autowired
    private AdminRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Admin, Integer> getRepository() {
        return repositorio;
    }

    @Override
    public Admin guardar(Admin objeto) {
        if (objeto.getIdAdmin()== null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Admin> c = obtenerXId(objeto.getIdAdmin());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Admin actualizar(Admin objeto) {
        if (objeto.getIdAdmin()!= null) {
            Optional<Admin> c = obtenerXId(objeto.getIdAdmin());
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
