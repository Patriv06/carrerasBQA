
package com.back.carreras.repository;

import com.back.carreras.model.Pilotos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotosRepository extends JpaRepository<Pilotos, Long>{
    public List <Pilotos> findByNombrePiloto (String nombrePiloto);
    
}
