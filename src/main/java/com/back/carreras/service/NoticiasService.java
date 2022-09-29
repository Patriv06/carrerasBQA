
package com.back.carreras.service;



import com.back.carreras.model.Noticias;
import com.back.carreras.repository.NoticiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class NoticiasService implements INoticiasService {
 @Autowired
       public NoticiasRepository notRepo;
    @Override
    public List<Noticias> verNoticias() {
        return notRepo.findAll();
    }
    @Override
    public void crearNoticias(Noticias not) {
        notRepo.save(not);
    }

    @Override
    public void borrarNoticias(Long id) {
        notRepo.deleteById(id);
    }

    @Override
    public Noticias buscarNoticias(Long id) {
       return notRepo.findById(id).orElse(null);
    }

    @Override
    public void modifNoticias(Noticias not) {
        notRepo.save(not);
    }

    @Override
    public List<Noticias> verNoticiasOrdenadas() {
         Sort sortOrder = Sort.by("fechaNoticia").descending(); 
 
       return notRepo
               .findAll(sortOrder);
        
    }

   

   
    
}
