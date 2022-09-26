
package com.back.carreras.service;

import com.back.carreras.model.CarreraPiloto;
import java.util.List;


public interface ICarreraPilotoService {
   public List<CarreraPiloto> verCarreraPiloto();
    
    public void crearCarreraPiloto(CarreraPiloto carPilot);
    
    public void borrarCarreraPiloto(Long id);
    
    public CarreraPiloto buscarCarreraPiloto(Long id);
    
    public void modifCarreraPiloto(CarreraPiloto carPilot); 
}
