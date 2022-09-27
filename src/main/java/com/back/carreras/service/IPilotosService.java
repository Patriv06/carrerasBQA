/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.carreras.service;



import com.back.carreras.model.Pilotos;
import java.util.List;

/**
 *
 * @author priva
 */
public interface IPilotosService {
     public List<Pilotos> verPilotos();
    
    public void crearPilotos(Pilotos pilot);
    
    public void borrarPilotos(Long id);
    
    public Pilotos buscarPilotos(Long id);
    
    public void modifPilotos(Pilotos pilot);
    
    public List<Pilotos> verPilotosPuntAntOrdenado();
    
    public List<Pilotos> verPilotosPuntActOrdenado();
    
    
}
