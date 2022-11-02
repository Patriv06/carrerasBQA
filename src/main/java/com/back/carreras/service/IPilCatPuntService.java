
package com.back.carreras.service;

import com.back.carreras.model.PilCatPunt;
import java.util.List;


public interface IPilCatPuntService {
  public List<PilCatPunt> verPilCatPunt();
  
  public List<PilCatPunt> verPilCatPutxPilyCat(String Pil, String Cat);
    
    public void crearPilCatPunt(PilCatPunt pcp);
    
    public void borrarPilCatPunt(Long id);
    
    public PilCatPunt buscarPilCatPunt(Long id);
    
    public void modifPilCatPunt(PilCatPunt pcp);  
}
