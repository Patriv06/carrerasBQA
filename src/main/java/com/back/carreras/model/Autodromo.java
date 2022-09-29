
package com.back.carreras.model;

import java.io.Serializable;
import java.util.HashSet;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idCarreras")
    private Set<Carreras> carreras = new HashSet<>();

    public Autodromo() {
    }

    public Autodromo(Long id, String nombreAutodromo) {
        this.id = id;
        this.nombreAutodromo = nombreAutodromo;
    }

    


}
 
   
    
   
  
   
  
    
    

