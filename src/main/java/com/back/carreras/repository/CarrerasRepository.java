
package com.back.carreras.repository;



import com.back.carreras.model.Carreras;
import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;





public interface CarrerasRepository extends JpaRepository<Carreras, Long> {
    
  
public List<Carreras> findByfechaCarrera(Date FCarrera);
   
}
