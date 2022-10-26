
package com.back.carreras.repository;

import com.back.carreras.model.PilCatPunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilCatPuntRepository extends JpaRepository<PilCatPunt, Long> {
    
}
