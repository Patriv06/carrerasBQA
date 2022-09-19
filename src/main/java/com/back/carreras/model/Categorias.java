
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
public class Categorias implements  Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String idCategoria;
    private String nombreCategoria;
    private float ponderadorCategoria;
    private String linkCategoria;

    public Categorias() {
    }

    public Categorias(Long id, String idCategoria, String nombreCategoria, float ponderadorCategoria, String linkCategoria) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.ponderadorCategoria = ponderadorCategoria;
        this.linkCategoria = linkCategoria;
    }

   

   
    
    
}
