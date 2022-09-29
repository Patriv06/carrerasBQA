
package com.back.carreras.model;

import java.io.Serializable;
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
public class Categorias implements  Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String idCategoria;
    private String nombreCategoria;
    private float ponderadorCategoria;
    private String linkCategoria;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idCarreras")
    private Set<Carreras> carreras = new HashSet<>();

    
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
