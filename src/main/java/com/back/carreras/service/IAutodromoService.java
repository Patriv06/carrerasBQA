
package com.back.carreras.service;



import com.back.carreras.model.Autodromo;
import java.util.List;


public interface IAutodromoService {
     public List<Autodromo> verAutodromo();
    
    public void crearAutodromo(Autodromo aut);
    
    public void borrarAutodromo(Long id);
    
    public Autodromo buscarAutodromo(Long id);
    
    public void modifAutodromo(Autodromo aut);
    
}
