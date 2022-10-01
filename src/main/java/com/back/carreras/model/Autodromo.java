
package com.back.carreras.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
    private Long idAutodromo;
    private String  nombreAutodromo;
    
  
  
 
    
    public Autodromo() {
    }

    public Autodromo(Long idAutodromo, String nombreAutodromo) {
        this.idAutodromo = idAutodromo;
        this.nombreAutodromo = nombreAutodromo;
    }

  

  

    

   
    


}
 
   
    
   
  
   
  
    
    

