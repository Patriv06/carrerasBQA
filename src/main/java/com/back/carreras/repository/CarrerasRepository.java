
package com.back.carreras.repository;



import com.back.carreras.model.Carreras;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import static org.springframework.jdbc.core.JdbcOperationsExtensionsKt.query;



public interface CarrerasRepository extends JpaRepository<Carreras, Long> {
    
   @Query("select c from Carrera c where c.fechaCarrera = ?1")
  Carreras findByFechaCarrera(Date fechaCarrera);
}
