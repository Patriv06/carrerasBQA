
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
