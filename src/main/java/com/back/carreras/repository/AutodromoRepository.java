
package com.back.carreras.repository;

import com.back.carreras.model.Autodromo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutodromoRepository extends JpaRepository<Autodromo, Long>{
    
}
