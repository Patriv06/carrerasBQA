
package com.back.carreras.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
    
    
    
    
}
