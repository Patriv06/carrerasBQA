
package com.back.carreras.repository;


import com.back.carreras.model.Categorias;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>{
    
    public List<Categorias> findByIdCategoria (String idCategoria);
    
}
