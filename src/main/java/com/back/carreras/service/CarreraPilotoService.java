/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.carreras.service;



import com.back.carreras.model.CarreraPiloto;
import com.back.carreras.repository.CarreraPilotoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author priva
 */
public class CarreraPilotoService implements ICarreraPilotoService{
    @Autowired
       public CarreraPilotoRepository carPilotRepo;

    @Override
    public List<CarreraPiloto> verCarreraPiloto() {
        return carPilotRepo.findAll();
    }

    @Override
    public void crearCarreraPiloto(CarreraPiloto carPilot) {
        carPilotRepo.save(carPilot);
    }

    @Override
    public void borrarCarreraPiloto(Long id) {
        carPilotRepo.deleteById(id);
    }

    @Override
    public CarreraPiloto buscarCarreraPiloto(Long id) {
        return carPilotRepo.findById(id).orElse(null);
    }

    @Override
    public void modifCarreraPiloto(CarreraPiloto carPilot) {
         carPilotRepo.save(carPilot);
    }

  
    
    
    
}
