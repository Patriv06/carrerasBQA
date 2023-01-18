
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
public class PuntPorCarrera implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
      private int puestoPPCarrera; 
    private int autosPPCarreras;
    private int puntosPPCarreras;

    public PuntPorCarrera() {
    }

    public PuntPorCarrera(int puestoPPCarrera, int autosPPCarreras, int puntosPPCarreras) {
        this.puestoPPCarrera = puestoPPCarrera;
        this.autosPPCarreras = autosPPCarreras;
        this.puntosPPCarreras = puntosPPCarreras;
    }

    
   

    
    
    

}
