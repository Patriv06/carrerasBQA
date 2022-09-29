
package com.back.carreras.service;



import com.back.carreras.model.Sponsors;
import com.back.carreras.repository.SponsorsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SponsorsService implements ISponsorsService {
    @Autowired
       public SponsorsRepository sponRepo;

    @Override
    public List<Sponsors> verSponsors() {
        return sponRepo.findAll();
    }

    @Override
    public void crearSponsors(Sponsors spon) {
        sponRepo.save(spon);
    }

    @Override
    public void borrarSponsors(Long id) {
        sponRepo.deleteById(id);
    }

    @Override
    public Sponsors buscarSponsors(Long id) {
        return sponRepo.findById(id).orElse(null);
    }

    @Override
    public void modifSponsors(Sponsors spon) {
         sponRepo.save(spon);
    }

    
}
