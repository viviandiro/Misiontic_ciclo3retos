/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.mintic.actividadReto3.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;
/**
 *
 * @author ViviJhon
 */
@Data
@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    @Column(length = 45)
    private String status="created";
    @ManyToOne
    @JoinColumn(name = "id_lib")
    @JsonIgnoreProperties({"reservations","client"})
    private Library lib;
    @ManyToOne
    @JoinColumn(name = "client")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;
    @ManyToOne
    @JoinColumn(name = "id_score")
    private Score score;

    
  

}
