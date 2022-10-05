
package com.back.carreras.repository;



import com.back.carreras.model.Carreras;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarrerasRepository extends JpaRepository<Carreras, Long> {
    
}
