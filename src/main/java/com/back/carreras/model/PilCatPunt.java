
package com.back.carreras.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PilCatPunt implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long idPilCatPunt;
    private String nombrePilotoPilCatPunt;
    private String idCategoriaPilCatPunt;
    private int puntosAntPilCantPunt;
    private int puntosActPilCantPunt;

    public PilCatPunt() {
    }

    public PilCatPunt(Long idPilCatPunt, String nombrePilotoPilCatPunt, String idCategoriaPilCatPunt, int puntosAntPilCantPunt, int puntosActPilCantPunt) {
        this.idPilCatPunt = idPilCatPunt;
        this.nombrePilotoPilCatPunt = nombrePilotoPilCatPunt;
        this.idCategoriaPilCatPunt = idCategoriaPilCatPunt;
        this.puntosAntPilCantPunt = puntosAntPilCantPunt;
        this.puntosActPilCantPunt = puntosActPilCantPunt;
    }
    
    
    
}
