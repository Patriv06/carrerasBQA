
package com.back.carreras.service;

import com.back.carreras.model.CarreraPiloto;
import com.back.carreras.repository.CarreraPilotoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraPilotoService implements ICarreraPilotoService{
    
@Autowired
    CarreraPilotoRepository carpilotRepo;

    @Override
    public List<CarreraPiloto> verCarreraPilotos() {
        return carpilotRepo.findAll();
    }

    @Override
    public void crearCarreraPilotos(CarreraPiloto carPil) {
        carpilotRepo.save(carPil);
    }

    @Override
    public void borrarCarreraPilotos(Long id) {
         carpilotRepo.deleteById(id);
    }

    @Override
    public CarreraPiloto buscarCarreraPilotos(Long id) {
       return carpilotRepo.findById(id).orElse(null);
    }

    @Override
    public void modifCarreraPilotos(CarreraPiloto carpilo) {
        carpilotRepo.save(carpilo);
    }

   

  

   
     
}

