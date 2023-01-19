/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.carreras.service;






import com.back.carreras.model.PilCatPunt;
import com.back.carreras.repository.PilCatPuntRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PilCatPuntService implements IPilCatPuntService {

    @Autowired
    PilCatPuntRepository pilcprep;
    
    @Override
    public List<PilCatPunt> verPilCatPunt() {
        return pilcprep.findAll();
    }

    @Override
    public void crearPilCatPunt(PilCatPunt pcp) {
        pilcprep.save(pcp);
    }

    @Override
    public void borrarPilCatPunt(Long id) {
        pilcprep.deleteById(id);
    }

    @Override
    public PilCatPunt buscarPilCatPunt(Long id) {
        return pilcprep.findById(id).orElse(null);
    }

    @Override
    public void modifPilCatPunt(PilCatPunt pcp) {
        pilcprep.save(pcp);
    }

    @Override
    public List<PilCatPunt> verPilCatPutxPil(String Pil) {
        return pilcprep.findByNombrePilotoPilCatPunt(Pil);
    }

    @Override
    public List<PilCatPunt> verPilCatPutxPilYCat(String Pil, String Cat) {
        return pilcprep.findByNombrePilotoPilCatPuntAndIdCategoriaPilCatPunt(Pil, Cat);
    }

    @Override
    public List<PilCatPunt> verPCPOrdenadoXPuntAct() {
            Sort sortOrder = 
            Sort.by(Sort.Order.asc("puntosActPilCantPunt"), Sort.Order.asc("nombrePilotoPilCatPunt")); 
 
       return pilcprep
               .findAll(sortOrder);
        
    }

   
    @Override
    public List<PilCatPunt> verPCPOrdenadoXPuntAnt() {
         Sort sortOrder = 
            Sort.by(Sort.Order.asc("puntosAntPilCantPunt"), Sort.Order.asc("nombrePilotoPilCatPunt")); 
 
       return pilcprep
               .findAll(sortOrder);
    }

    @Override
    public List<PilCatPunt> verPCPOrdenadoXPosAct() {
  Sort sortOrder = Sort.by(Sort.Order.asc("posActPCP"), Sort.Order.asc("idPilCatPunt")); 
 
       return pilcprep
               .findAll(sortOrder);    }

    @Override
    public List<PilCatPunt> verPCPOrdenadoXPosAnt() {
 Sort sortOrder = Sort.by(Sort.Order.asc("posAntPCP"), Sort.Order.asc("idPilCatPunt")); 
 
       return pilcprep
               .findAll(sortOrder);       }

    

  

    
}
