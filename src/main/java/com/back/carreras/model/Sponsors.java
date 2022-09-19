
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
    private String logoSponsor;
    private String linkSponsor;
    private String espacioSponsor;

    public Sponsors(Long id, String logoSponsor, String linkSponsor, String espacioSponsor) {
        this.id = id;
        this.logoSponsor = logoSponsor;
        this.linkSponsor = linkSponsor;
        this.espacioSponsor = espacioSponsor;
    }

    public Sponsors() {
    }

   
    
    
}