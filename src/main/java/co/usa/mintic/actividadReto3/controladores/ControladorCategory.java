/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.controladores;

import co.usa.mintic.actividadReto3.modelo.entidades.Category;
import co.usa.mintic.actividadReto3.modelo.entidades.Library;
import co.usa.mintic.actividadReto3.servicios.CategoryServicio;
import co.usa.mintic.actividadReto3.servicios.LibraryServicio;
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
@RequestMapping("/api/Category")
@CrossOrigin("*")
public class ControladorCategory extends ControladorGenericoAbstracto<Category, Integer> {

    @Autowired
    private CategoryServicio servicio;

    @Override
    public ServicioGenericoAbstracto<Category, Integer> getService() {
        return servicio;
    } 
    
}
