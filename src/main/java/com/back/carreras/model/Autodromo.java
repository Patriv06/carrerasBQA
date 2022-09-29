
package com.back.carreras.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Autodromo implements Serializable{
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  nombreAutodromo;

 
   
    
    @OneToMany(mappedBy = "Carreras" )
    private List<Carreras> carreras;

    public Autodromo() {
    }

    public Autodromo(Long id, String nombreAutodromo, List<Carreras> carreras) {
        this.id = id;
        this.nombreAutodromo = nombreAutodromo;
        this.carreras = carreras;
    }
    
    
}
