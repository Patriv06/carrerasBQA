
package com.back.carreras.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Carreras implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoriaCarrera;
    private String pilotoCarrera;
    private String autodromoCarrera;
    private String temporadaCarrera;
    private String cantPilCarrera;
    private int multiplCarrera;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCarrera;
  
    public Carreras() {
    }

    public Carreras(Long id, String categoriaCarrera, String pilotoCarrera, String autodromoCarrera, String temporadaCarrera, String cantPilCarrera, int multiplCarrera, Date fechaCarrera) {
        this.id = id;
        this.categoriaCarrera = categoriaCarrera;
        this.pilotoCarrera = pilotoCarrera;
        this.autodromoCarrera = autodromoCarrera;
        this.temporadaCarrera = temporadaCarrera;
        this.cantPilCarrera = cantPilCarrera;
        this.multiplCarrera = multiplCarrera;
        this.fechaCarrera = fechaCarrera;
    }
    
    
    
    
}
