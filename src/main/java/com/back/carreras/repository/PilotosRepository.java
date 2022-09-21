
package com.back.carreras.repository;

import com.back.carreras.model.Pilotos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotosRepository extends JpaRepository<Pilotos, Long>{
    
}
