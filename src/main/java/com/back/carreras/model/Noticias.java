
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
public class Noticias implements  Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
      @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNoticia;
    private String cuerpoNoticia;

    public Noticias() {
    }

    public Noticias(Long id, Date fechaNoticia, String cuerpoNoticia) {
        this.id = id;
        this.fechaNoticia = fechaNoticia;
        this.cuerpoNoticia = cuerpoNoticia;
    }

   
   
}
