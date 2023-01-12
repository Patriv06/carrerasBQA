
package com.back.carreras.model;


import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.puestoCarreraPiloto;
        hash = 47 * hash + Objects.hashCode(this.pilotos);
        hash = 47 * hash + Objects.hashCode(this.carreras);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarreraPiloto other = (CarreraPiloto) obj;
        if (this.puestoCarreraPiloto != other.puestoCarreraPiloto) {
            return false;
        }
        if (!Objects.equals(this.pilotos, other.pilotos)) {
            return false;
        }
        return Objects.equals(this.carreras, other.carreras);
    }
    
   
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
