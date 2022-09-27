/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.carreras.service;


import com.back.carreras.model.CarreraPiloto;
import java.util.List;

/**
 *
 * @author priva
 */
public interface ICarreraPilotoService {
    
    public List<CarreraPiloto> verCarreraPiloto();
    
    public void crearCarreraPiloto(CarreraPiloto carPilot);
    
    public void borrarCarreraPiloto(Long id);
    
    public CarreraPiloto buscarCarreraPiloto(Long id);
    
    public void modifCarreraPiloto(CarreraPiloto carPilot); 

}
