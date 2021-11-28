/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.controladores;

/**
 *
 * @author ViviJhon
 */
import co.usa.mintic.actividadReto3.servicios.ServicioGenericoAbstracto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class ControladorGenericoAbstracto<T, ID extends Serializable> {

    public abstract ServicioGenericoAbstracto<T, ID> getService();

    @GetMapping("/all")
    public List<T> obtenerTodos(T entidad) {
        return getService().obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<T> obtenerPorId(@PathVariable("id") ID id) {
        return getService().obtenerXId(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public T guardar(@RequestBody T entidad) {
        return getService().guardar(entidad);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public T actualizar(@RequestBody T entidad) {
        return getService().actualizar(entidad);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean eliminar(@PathVariable("id") ID id) {
        return getService().eliminar(id);
    }
}

