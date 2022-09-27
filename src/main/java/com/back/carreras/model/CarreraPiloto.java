
package com.back.carreras.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class CarreraPiloto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int puestoCarreraPiloto;
   @ManyToMany(mappedBy = "CarreraPiloto")
    private Set<Pilotos> pilotos = new HashSet<>();
   @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "carrera_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Carreras carreras;
    
    public CarreraPiloto() {
    }

    public CarreraPiloto(Long id, int puestoCarreraPiloto, Carreras carreras) {
        this.id = id;
        this.puestoCarreraPiloto = puestoCarreraPiloto;
        this.carreras = carreras;
    }

    
    
    
    
}
