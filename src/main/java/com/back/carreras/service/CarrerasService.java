
package com.back.carreras.service;



import com.back.carreras.model.Carreras;
import com.back.carreras.repository.CarrerasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CarrerasService implements ICarrerasService {
    @Autowired
       public CarrerasRepository carRepo;

    @Override
    public List<Carreras> verCarreras() {
        return carRepo.findAll();
    }

     public List<Carreras> verCarrerasOrdenadas() {
        Sort sortOrder = Sort.by("fechaCarrera").descending(); 
 
       return carRepo
               .findAll(sortOrder);
    }
    @Override
    public void crearCarreras(Carreras car) {
        carRepo.save(car);
    }
       

    @Override
    public void borrarCarreras(Long id) {
        carRepo.deleteById(id);
    }

    @Override
    public Carreras buscarCarreras(Long id) {
        return carRepo.findById(id).orElse(null);
    }

    @Override
    public void modifCarreras(Carreras car) {
        carRepo.save(car);
    }

   
   
    
}
