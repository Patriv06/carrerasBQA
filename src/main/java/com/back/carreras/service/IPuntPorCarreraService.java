/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.carreras.service;

import com.back.carreras.model.PuntPorCarrera;
import java.util.List;

/**
 *
 * @author priva
 */
public interface IPuntPorCarreraService {
    public List<PuntPorCarrera> verPuntPorCarrera();
    
    public List<PuntPorCarrera> verPuntPorCarreraOrdXQAutos(int autos);
    
    public void crearPuntPorCarrera(PuntPorCarrera ppc);
    
    public void borrarPuntPorCarrera(Long id);
    
    public PuntPorCarrera buscarPuntPorCarrera(Long id);
    
    public void modifPuntPorCarrera(PuntPorCarrera aut);
}
