
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
public class Sponsors implements  Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreSponsor; 
    private String linkSponsor;
    private String espacioSponsor;
    private String logoSponsor;

    public Sponsors(String nombreSponsor, String linkSponsor, String espacioSponsor, String logoSponsor) {
        this.nombreSponsor = nombreSponsor;
        this.linkSponsor = linkSponsor;
        this.espacioSponsor = espacioSponsor;
        this.logoSponsor = logoSponsor;
    }

    

    public Sponsors() {
    }

   
    
    
}
