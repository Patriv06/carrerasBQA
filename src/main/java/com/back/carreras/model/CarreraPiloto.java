
package com.back.carreras.model;


import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class CarreraPiloto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int puestoCarreraPiloto;
    
   @ManyToOne
  @JoinColumn(name= "idPiloto")
  private Pilotos pilotos;
    
   
    @ManyToOne
  @JoinColumn(name= "idCarreras")
  private Carreras carreras;
    
    public CarreraPiloto() {
    }

    public CarreraPiloto(Long id, int puestoCarreraPiloto, Pilotos pilotos, Carreras carreras) {
        this.id = id;
        this.puestoCarreraPiloto = puestoCarreraPiloto;
        this.pilotos = pilotos;
        this.carreras = carreras;
    }

    

    
    
    
    
}
