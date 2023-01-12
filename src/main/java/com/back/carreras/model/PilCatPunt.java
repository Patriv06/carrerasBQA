
package com.back.carreras.model;

import java.io.Serializable;
import java.util.Objects;
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
    private int posActPCP;
    private int posAntPCP;
    private int PuntTotActPCP;
    private int PuntTotAntPCP;
    private String nombrePilotoPilCatPunt;
    private String idCategoriaPilCatPunt;
    private int puntosAntPilCantPunt;
    private int puntosActPilCantPunt;

    public PilCatPunt() {
    }

    public PilCatPunt(Long idPilCatPunt, int posActPCP, int posAntPCP, int PuntTotActPCP, int PuntTotAntPCP, String nombrePilotoPilCatPunt, String idCategoriaPilCatPunt, int puntosAntPilCantPunt, int puntosActPilCantPunt) {
        this.idPilCatPunt = idPilCatPunt;
        this.posActPCP = posActPCP;
        this.posAntPCP = posAntPCP;
        this.PuntTotActPCP = PuntTotActPCP;
        this.PuntTotAntPCP = PuntTotAntPCP;
        this.nombrePilotoPilCatPunt = nombrePilotoPilCatPunt;
        this.idCategoriaPilCatPunt = idCategoriaPilCatPunt;
        this.puntosAntPilCantPunt = puntosAntPilCantPunt;
        this.puntosActPilCantPunt = puntosActPilCantPunt;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombrePilotoPilCatPunt);
        hash = 79 * hash + Objects.hashCode(this.idCategoriaPilCatPunt);
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
        final PilCatPunt other = (PilCatPunt) obj;
        if (!Objects.equals(this.nombrePilotoPilCatPunt, other.nombrePilotoPilCatPunt)) {
            return false;
        }
        return Objects.equals(this.idCategoriaPilCatPunt, other.idCategoriaPilCatPunt);
    }
    
    
    
}
