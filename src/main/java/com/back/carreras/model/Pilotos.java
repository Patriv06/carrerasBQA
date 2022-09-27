
package com.back.carreras.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pilotos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombrePiloto;
    private String apellidoPiloto;
    private String urlImgPiloto;
    private float puntajeAntPiloto;
    private float puntajeActPiloto;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CarreraPiloto_Piloto",
        joinColumns = @JoinColumn(name = "piloto_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "carreraPiloto_id", referencedColumnName = "id"))
    private Set<CarreraPiloto> carreraPiloto;
    

    public Pilotos() {
    }

    public Pilotos(Long id, String nombrePiloto, String apellidoPiloto, String urlImgPiloto, float puntajeAntPiloto, float puntajeActPiloto, Set<CarreraPiloto> carreraPiloto) {
        this.id = id;
        this.nombrePiloto = nombrePiloto;
        this.apellidoPiloto = apellidoPiloto;
        this.urlImgPiloto = urlImgPiloto;
        this.puntajeAntPiloto = puntajeAntPiloto;
        this.puntajeActPiloto = puntajeActPiloto;
        this.carreraPiloto = carreraPiloto;
    }

   
    }

    
  
    
    
    
    

