
package com.back.carreras.service;



import com.back.carreras.model.Noticias;
import java.util.List;


public interface INoticiasService {
    public List<Noticias> verNoticias();
    
    public void crearNoticias(Noticias not);
    
    public void borrarNoticias(Long id);
    
    public Noticias buscarNoticias(Long id);
    
    public void modifNoticias(Noticias not);
    
    public List<Noticias> verNoticiasOrdenadas();
    
}
