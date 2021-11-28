/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.controladores;

import co.usa.mintic.actividadReto3.modelo.entidades.Score;
import co.usa.mintic.actividadReto3.servicios.ScoreServicio;
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
@RequestMapping("/api/Score")
@CrossOrigin("*")
public class ContorladorScore extends ControladorGenericoAbstracto<Score, Integer> {

    @Autowired
    private ScoreServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Score, Integer> getService() {
        return servicio;
    }

}
