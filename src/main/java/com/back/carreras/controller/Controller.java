
package com.back.carreras.controller;


import com.back.carreras.model.Categorias;
import com.back.carreras.service.ICategoriasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
      ICategoriasService cateServ;
    @PostMapping ("/categorias")
    @CrossOrigin(origins="http://localhost:4200")
  //  @CrossOrigin(origins ="https://cvpatriciarivas")
    public void agregarCategorias(@RequestBody Categorias cat){
     //   listaCategorias.add(cat);
     cateServ.crearCategorias(cat);
    }
    
    @GetMapping ("/ver/categorias")
    @ResponseBody
  @CrossOrigin(origins="http://localhost:4200")
    //@CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Categorias> verCategorias(){
     //   return listaCategorias;
    
     return cateServ.verCategorias();
    }
    @DeleteMapping ("/delete/categorias/{id}")
    @CrossOrigin(origins="http://localhost:4200")
    public void borrarCategorias(@PathVariable Long id){
        cateServ.borrarCategorias(id);
    }
    
    @PutMapping("/modif/categorias")
    @CrossOrigin(origins="http://localhost:4200")
  //  @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarCategorias(@RequestBody Categorias cat){
        cateServ.modifCategorias(cat);    }
    
}
