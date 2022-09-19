
package com.back.carreras.service;


import com.back.carreras.model.Categorias;
import java.util.List;


public interface ICategoriasService {
    
    public List<Categorias> verCategorias();
    
    public void crearCategorias(Categorias cat);
    
    public void borrarCategorias(Long id);
    
    public Categorias buscarCategorias(Long id);
    
    public void modifCategorias(Categorias cat);
    
    
}
