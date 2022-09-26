
package com.back.carreras.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class CarreraPiloto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinColumn(name="id_pilotos")
    Pilotos pilotos;
    @ManyToOne
    @JoinColumn(name="id_Carreras")
    Carreras carreras;
    private int puestoCarrera;
    private int puntosCarrera;

    public CarreraPiloto(Long id, Pilotos pilotos, Carreras carreras, int puestoCarrera, int puntosCarrera) {
        this.id = id;
        this.pilotos = pilotos;
        this.carreras = carreras;
        this.puestoCarrera = puestoCarrera;
        this.puntosCarrera = puntosCarrera;
        
        
    }

    public CarreraPiloto() {
    }
    
    
    
}
