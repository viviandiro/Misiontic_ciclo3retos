/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;

import co.usa.mintic.actividadReto3.modelo.crud.MessageRepositorio;
import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import co.usa.mintic.actividadReto3.modelo.entidades.Message;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ViviJhon
 */
@Service
public class MessageServicio extends ServicioGenericoAbstracto<Message, Integer> {

    @Autowired
    private MessageRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Message, Integer> getRepository() {
        return repositorio;
    }

    @Override
    public Message guardar(Message objeto) {
        if (objeto.getIdMessage()== null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Message> c = obtenerXId(objeto.getIdMessage());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Message actualizar(Message objeto) {
        if (objeto.getIdMessage()!= null) {
            Optional<Message> c = obtenerXId(objeto.getIdMessage());
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
