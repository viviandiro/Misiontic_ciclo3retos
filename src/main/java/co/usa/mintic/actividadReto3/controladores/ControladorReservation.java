/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.controladores;

import co.usa.mintic.actividadReto3.modelo.entidades.Reservation;
import co.usa.mintic.actividadReto3.servicios.ReservationServicio;
import co.usa.mintic.actividadReto3.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ViviJhon
 */
@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin("*")
public class ControladorReservation extends ControladorGenericoAbstracto<Reservation, Integer> {

    @Autowired
    private ReservationServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Reservation, Integer> getService() {
        return servicio;
    }

}
