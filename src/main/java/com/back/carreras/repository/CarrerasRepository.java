
package com.back.carreras.repository;



import com.back.carreras.model.Carreras;
import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface CarrerasRepository extends JpaRepository<Carreras, Long> {
    
    @Query(
        value="SELECT * FROM carreras WHERE carreras.fechaCarrera LIKE %:FCarr%",
        nativeQuery=true             
                )
  
    public List<Carreras> encontrar(@Param("FCarr") Date FCarr);
   
}
