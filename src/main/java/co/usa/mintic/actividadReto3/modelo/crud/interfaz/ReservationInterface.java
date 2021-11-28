/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.modelo.crud.interfaz;

import co.usa.mintic.actividadReto3.modelo.entidades.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ViviJhon
 */
public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
    
}
