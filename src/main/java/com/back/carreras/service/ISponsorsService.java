/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.carreras.service;



import com.back.carreras.model.Sponsors;
import java.util.List;

/**
 *
 * @author priva
 */
public interface ISponsorsService {
     public List<Sponsors> verSponsors();
    
    public void crearSponsors(Sponsors spon);
    
    public void borrarSponsors(Long id);
    
    public Sponsors buscarSponsors(Long id);
    
    public void modifSponsors(Sponsors spon);
}
