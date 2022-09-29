
package com.back.carreras.service;




import com.back.carreras.model.Sponsors;
import java.util.List;


public interface ISponsorsService {
     public List<Sponsors> verSponsors();
    
    public void crearSponsors(Sponsors spon);
    
    public void borrarSponsors(Long id);
    
    public Sponsors buscarSponsors(Long id);
    
    public void modifSponsors(Sponsors spon);
}
