
package com.back.carreras.repository;

import com.back.carreras.model.CarreraPiloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraPilotoRepository extends JpaRepository <CarreraPiloto, Long>{
    
}
