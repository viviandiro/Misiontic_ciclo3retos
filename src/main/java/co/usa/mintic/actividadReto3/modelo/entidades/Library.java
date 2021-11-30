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
 * @author Viviana diaz rojas
 */
@Entity
@Table(name ="libreria")
@Data
public class Library implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String target;
    @Column(length = 20)
    private Integer capacity;
    @Column(length = 250)
    private String description;
    @ManyToOne
    @JoinColumn(name = "category")
    @JsonIgnoreProperties("libs")
    private Category category;
    
    @OneToMany(mappedBy = "lib", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"category","lib","client"})
    private List<Message> messages;
    
    @OneToMany(mappedBy = "lib", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"libs"})
    private List<Reservation> reservations;
}
   