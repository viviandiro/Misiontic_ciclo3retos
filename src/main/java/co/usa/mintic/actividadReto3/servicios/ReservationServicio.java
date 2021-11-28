/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;

import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import co.usa.mintic.actividadReto3.modelo.crud.ReservationRepositorio;
import co.usa.mintic.actividadReto3.modelo.entidades.Reservation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ViviJhon
 */
@Service
public class ReservationServicio extends ServicioGenericoAbstracto<Reservation, Integer> {

    @Autowired
    private ReservationRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Reservation, Integer> getRepository() {
        return repositorio;
    }

    @Override
    public Reservation guardar(Reservation objeto) {
        if (objeto.getIdReservation()== null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Reservation> c = obtenerXId(objeto.getIdReservation());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Reservation actualizar(Reservation objeto) {
        if (objeto.getIdReservation() != null) {
            Optional<Reservation> c = obtenerXId(objeto.getIdReservation());
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
