
package com.back.carreras.service;





import com.back.carreras.model.Carreras;
import java.util.List;


public interface ICarrerasService {
     public List<Carreras> verCarreras();
    
    public void crearCarreras(Carreras car);
    
    public void borrarCarreras(Long id);
    
    public Carreras buscarCarreras(Long id);
    
    public void modifCarreras(Carreras car);
    
    public List<Carreras> verCarrerasOrdenadas();
    
}
