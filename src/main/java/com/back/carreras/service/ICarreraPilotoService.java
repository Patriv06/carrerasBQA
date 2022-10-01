
package com.back.carreras.service;

import com.back.carreras.model.CarreraPiloto;
import java.util.List;


public interface ICarreraPilotoService {
     public List<CarreraPiloto> verCarreraPilotos();
    
    public void crearCarreraPilotos(CarreraPiloto carPil);
    
    public void borrarCarreraPilotos(Long id);
    
    public CarreraPiloto buscarCarreraPilotos(Long id);
    
    public void modifCarreraPilotos(CarreraPiloto CarPilot);
    
    
    
}
