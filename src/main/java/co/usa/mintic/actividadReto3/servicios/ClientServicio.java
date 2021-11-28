/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;



import co.usa.mintic.actividadReto3.modelo.crud.ClientRepositorio;
import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import co.usa.mintic.actividadReto3.modelo.entidades.Client;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author ViviJhon
 */
@Service
public class ClientServicio extends ServicioGenericoAbstracto<Client, Integer> {

    @Autowired
    private ClientRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Client, Integer> getRepository() {
        return repositorio;
    }

   @Override
    public Client guardar(Client objeto) {
        if (objeto.getIdClient()== null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Client> c = obtenerXId(objeto.getIdClient());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Client actualizar(Client objeto) {
        if (objeto.getIdClient()!= null) {
            Optional<Client> c = obtenerXId(objeto.getIdClient());
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
