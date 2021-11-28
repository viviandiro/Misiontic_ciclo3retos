/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.modelo.crud;

import co.usa.mintic.actividadReto3.modelo.crud.interfaz.ScoreInterface;
import co.usa.mintic.actividadReto3.modelo.entidades.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ViviJhon
 */
@Repository
public class ScoreRepositorio extends RepositorioGenericoAbstracto<Score, Integer> {

    @Autowired
    private ScoreInterface anInterface;

    @Override
    public CrudRepository<Score, Integer> getDao() {
        return anInterface;
    }
    
}
