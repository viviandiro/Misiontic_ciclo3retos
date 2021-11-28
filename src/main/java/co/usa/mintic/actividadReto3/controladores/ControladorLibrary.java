/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.controladores;

import co.usa.mintic.actividadReto3.modelo.entidades.Library;
import co.usa.mintic.actividadReto3.servicios.LibraryServicio;
import co.usa.mintic.actividadReto3.servicios.ServicioGenericoAbstracto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Lib")
@CrossOrigin("*")
public class ControladorLibrary extends ControladorGenericoAbstracto<Library, Integer> {

    @Autowired
    private LibraryServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Library, Integer> getService() {
        return servicio;
    }
}
