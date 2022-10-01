
package com.back.carreras.service;




import com.back.carreras.model.Autodromo;
import com.back.carreras.repository.AutodromoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutodromoService implements IAutodromoService {
    
    @Autowired
    AutodromoRepository autRepo;

    @Override
    public List<Autodromo> verAutodromo() {
        return autRepo.findAll();
    }

    @Override
    public void crearAutodromo(Autodromo aut) {
        autRepo.save(aut);
    }

    @Override
    public void borrarAutodromo(Long id) {
        autRepo.deleteById(id);
    }

    @Override
    public Autodromo buscarAutodromo(Long id) {
       return autRepo.findById(id).orElse(null);
    }

    @Override
    public void modifAutodromo(Autodromo aut) {
        autRepo.save(aut);
    }

   

  

   
     
}
