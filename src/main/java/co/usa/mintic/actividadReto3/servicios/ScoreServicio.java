/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.servicios;

import co.usa.mintic.actividadReto3.modelo.crud.RepositorioGenericoAbstracto;
import co.usa.mintic.actividadReto3.modelo.crud.ScoreRepositorio;
import co.usa.mintic.actividadReto3.modelo.entidades.Score;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ViviJhon
 */
@Service
public class ScoreServicio extends ServicioGenericoAbstracto<Score, Integer> {

    @Autowired
    private ScoreRepositorio repositorio;

    @Override
    public RepositorioGenericoAbstracto<Score, Integer> getRepository() {
        return repositorio;
    }

    @Override
    public Score guardar(Score objeto) {
        if (objeto.getIdScore()== null) {
            return repositorio.guardar(objeto);
        } else {
            Optional<Score> c = obtenerXId(objeto.getIdScore());
            if (c.isEmpty()) {
                return repositorio.guardar(objeto);
            } else {
                return objeto;
            }
        }
    }

    @Override
    public Score actualizar(Score objeto) {
        if (objeto.getIdScore()!= null) {
            Optional<Score> c = obtenerXId(objeto.getIdScore());
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
