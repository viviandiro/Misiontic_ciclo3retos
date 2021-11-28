/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ViviJhon
 */
@Data
@Entity
@Table(name = "score")
public class Score implements Serializable {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 5)
    private Integer idScore;
    private String calificacion;
    @Column(length = 250)
    private String mensaje;
    

    @OneToMany(mappedBy = "score", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("score")
    List<Reservation> reservations;

}
