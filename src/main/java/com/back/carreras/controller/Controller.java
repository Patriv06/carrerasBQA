
package com.back.carreras.controller;



import com.back.carreras.model.Autodromo;
import com.back.carreras.model.Categorias;
import com.back.carreras.model.Noticias;
import com.back.carreras.model.Sponsors;



import com.back.carreras.service.IAutodromoService;
import com.back.carreras.service.ICategoriasService;
import com.back.carreras.service.INoticiasService;
import com.back.carreras.service.ISponsorsService;




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
    
    
 //CATEGORIAS   
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
    
  //SPONSORS  
    
     @Autowired
      ISponsorsService sponServ;
    @PostMapping ("/sponsors")
    @CrossOrigin(origins="http://localhost:4200")
  //  @CrossOrigin(origins ="https://cvpatriciarivas")
    public void agregarSponsors(@RequestBody Sponsors spon){
     //   listaCategorias.add(cat);
     sponServ.crearSponsors(spon);
    }
    
    @GetMapping ("/ver/sponsors")
    @ResponseBody
  @CrossOrigin(origins="http://localhost:4200")
    //@CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Sponsors> verSponsors(){
     //   return listaCategorias;
    
     return sponServ.verSponsors();
    }
    @DeleteMapping ("/delete/sponsors/{id}")
    @CrossOrigin(origins="http://localhost:4200")
    public void borrarSponsors(@PathVariable Long id){
        sponServ.borrarSponsors(id);
    }
    
    @PutMapping("/modif/sponsors")
    @CrossOrigin(origins="http://localhost:4200")
    public void modificarSponsors(@RequestBody Sponsors spon){
        sponServ.modifSponsors(spon);    }
    
  //NOTICIAS  
     @Autowired
      INoticiasService notServ;
    @PostMapping ("/noticias")
    @CrossOrigin(origins="http://localhost:4200")
  //  @CrossOrigin(origins ="https://cvpatriciarivas")
    public void agregarNoticias (@RequestBody Noticias not){
     //   listaCategorias.add(cat);
     notServ.crearNoticias(not);
    }
    
    @GetMapping ("/ver/noticias")
    @ResponseBody
  @CrossOrigin(origins="http://localhost:4200")
    //@CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Noticias> verNoticias(){
    
    
     return notServ.verNoticias();
    }
    @DeleteMapping ("/delete/noticias/{id}")
    @CrossOrigin(origins="http://localhost:4200")
    public void borrarNoticias(@PathVariable Long id){
        notServ.borrarNoticias(id);
    }
    
    @PutMapping("/modif/noticias")
    @CrossOrigin(origins="http://localhost:4200")
  //  @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarNoticias(@RequestBody Noticias not){
        notServ.modifNoticias(not); }
    
    @GetMapping ("/ver/noticiasOrdenadas")
    @ResponseBody
  @CrossOrigin(origins="http://localhost:4200")
    //@CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Noticias> verNoticiasOrdenadas(){
        return notServ.verNoticiasOrdenadas();
    }
    
    //AUTODROMO 
     @Autowired
      IAutodromoService autServ;
    @PostMapping ("/autodromos")
    @CrossOrigin(origins="http://localhost:4200")
  //  @CrossOrigin(origins ="https://cvpatriciarivas")
    public void agregarAutodromos (@RequestBody Autodromo aut){
     //   listaCategorias.add(cat);
     autServ.crearAutodromo(aut);
    }
    
    @GetMapping ("/ver/autodromos")
    @ResponseBody
  @CrossOrigin(origins="http://localhost:4200")
    //@CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public List <Autodromo> verAutodromos(){
    
    
     return autServ.verAutodromo();
    }
    @DeleteMapping ("/delete/autodromos/{id}")
    @CrossOrigin(origins="http://localhost:4200")
    public void borrarAutodromo(@PathVariable Long id){
        autServ.borrarAutodromo(id);
    }
    
    @PutMapping("/modif/autodromos")
    @CrossOrigin(origins="http://localhost:4200")
  //  @CrossOrigin(origins ="https://cvpatriciarivas.web.app")
    public void modificarAutodromo(@RequestBody Autodromo aut){
        autServ.modifAutodromo(aut); }
    
    
}
