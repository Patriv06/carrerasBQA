
package com.back.carreras.controller;



import com.back.carreras.model.Autodromo;
import com.back.carreras.model.CarreraPiloto;
import com.back.carreras.model.Carreras;
import com.back.carreras.model.Categorias;
import com.back.carreras.model.Noticias;
import com.back.carreras.model.PilCatPunt;
import com.back.carreras.model.Pilotos;
import com.back.carreras.model.PuntPorCarrera;
import com.back.carreras.model.Sponsors;
import com.back.carreras.repository.CategoriasRepository;
import com.back.carreras.repository.PilCatPuntRepository;
import com.back.carreras.repository.PuntPorCarreraRepository;
import com.back.carreras.service.IAutodromoService;
import com.back.carreras.service.ICarreraPilotoService;
import com.back.carreras.service.ICarrerasService;
import com.back.carreras.service.ICategoriasService;

import com.back.carreras.service.INoticiasService;
import com.back.carreras.service.IPilCatPuntService;
import com.back.carreras.service.IPilotosService;
import com.back.carreras.service.IPuntPorCarreraService;
import com.back.carreras.service.ISponsorsService;






import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    
 //CATEGORIAS   
    @Autowired
      ICategoriasService cateServ;
    @PostMapping ("/categorias")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarCategorias(@RequestBody Categorias cat){
     //   listaCategorias.add(cat);
     cateServ.crearCategorias(cat);
    }
    
    @GetMapping ("/ver/categorias")
    @ResponseBody
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
   
    
    public List <Categorias> verCategorias(){
     //   return listaCategorias;
    
     return cateServ.verCategorias();
    }
    
     @Autowired
    CategoriasRepository catRep;
    
    @GetMapping("/ver/catXIdCat")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
	public ResponseEntity<List<Categorias>> getcategoriasPorIdCat(@RequestParam String idCategoria) {
		return new ResponseEntity<List<Categorias>>(catRep.findByIdCategoria(idCategoria), HttpStatus.OK);
	}
    
    
    @DeleteMapping ("/delete/categorias/{id}")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarCategorias(@PathVariable Long id){
        cateServ.borrarCategorias(id);
    }
    
    @PutMapping("/modif/categorias")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarCategorias(@RequestBody Categorias cat){
        cateServ.modifCategorias(cat);    }
    
  //SPONSORS  
    
     @Autowired
      ISponsorsService sponServ;
    @PostMapping ("/sponsors")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarSponsors(@RequestBody Sponsors spon){
     //   listaCategorias.add(cat);
     sponServ.crearSponsors(spon);
    }
    
    @GetMapping ("/ver/sponsors")
    @ResponseBody
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Sponsors> verSponsors(){
     //   return listaCategorias;
    
     return sponServ.verSponsors();
    }
    @DeleteMapping ("/delete/sponsors/{id}")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarSponsors(@PathVariable Long id){
        sponServ.borrarSponsors(id);
    }
    
    @PutMapping("/modif/sponsors")
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarSponsors(@RequestBody Sponsors spon){
        sponServ.modifSponsors(spon);    }
    
  //NOTICIAS  
     @Autowired
      INoticiasService notServ;
    @PostMapping ("/noticias")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarNoticias (@RequestBody Noticias not){
     //   listaCategorias.add(cat);
     notServ.crearNoticias(not);
    }
    
    @GetMapping ("/ver/noticias")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Noticias> verNoticias(){
    
    
     return notServ.verNoticias();
    }
    @DeleteMapping ("/delete/noticias/{id}")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarNoticias(@PathVariable Long id){
        notServ.borrarNoticias(id);
    }
    
    @PutMapping("/modif/noticias")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarNoticias(@RequestBody Noticias not){
        notServ.modifNoticias(not); }
    
    @GetMapping ("/ver/noticiasOrdenadas")
    @ResponseBody
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Noticias> verNoticiasOrdenadas(){
        return notServ.verNoticiasOrdenadas();
    }
    
    //AUTODROMO 
     @Autowired
      IAutodromoService autServ;
    @PostMapping ("/autodromos")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarAutodromos (@RequestBody Autodromo aut){
     //   listaCategorias.add(cat);
     autServ.crearAutodromo(aut);
    }
    
    @GetMapping ("/ver/autodromos")
    @ResponseBody
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Autodromo> verAutodromos(){
    
    
     return autServ.verAutodromo();
    }
    
      @GetMapping ("/ver/autodromos/{id}")
    @ResponseBody
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void verAutodromosPorId(@PathVariable Long id){
    
    
    autServ.buscarAutodromo(id);
    }
    
    @DeleteMapping ("/delete/autodromos/{id}")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarAutodromo(@PathVariable Long id){
        autServ.borrarAutodromo(id);
    }
    
    @PutMapping("/modif/autodromos")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarAutodromo(@RequestBody Autodromo aut){
        autServ.modifAutodromo(aut); }
    
     //PILOTOS  
     @Autowired
      IPilotosService pilotServ;
    @PostMapping ("/pilotos")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarPilotos (@RequestBody Pilotos pil){
     //   listaCategorias.add(cat);
     pilotServ.crearPilotos(pil);
    }
    
    @GetMapping ("/ver/pilotos")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Pilotos> verPilotos(){
    
    
     return pilotServ.verPilotos();
    }
    
     @GetMapping ("/ver/pilotosXnombre/{nom}")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Pilotos> verPilotosXnombre (@PathVariable String nom){
     return pilotServ.verPilotosXNombre(nom);
    }
    
    
    @DeleteMapping ("/delete/pilotos/{id}")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarPilotos(@PathVariable Long id){
        pilotServ.borrarPilotos(id);
    }
    
    @PutMapping("/modif/pilotos")
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarPilotos(@RequestBody Pilotos pil){
        pilotServ.modifPilotos(pil); }
    
    @GetMapping ("/ver/pilOrdenPunAnt")
    @ResponseBody
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Pilotos> verPilotosOrdenPuntAnt(){
        return pilotServ.verPilotosPuntAntOrdenado();
    }
    @GetMapping ("/ver/pilOrdenPunAct")
    @ResponseBody
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Pilotos> verPilotosOrdenPuntAct(){
        return pilotServ.verPilotosPuntActOrdenado();
    }
    
        //carreras
     @Autowired
      ICarrerasService carServ;
    @PostMapping ("/carreras")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarCarreras (@RequestBody Carreras car){
     //   listaCategorias.add(cat);
     carServ.crearCarreras(car);
    }
    
    @GetMapping ("/ver/carreras")
    @ResponseBody
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Carreras> verCarreras(){
    
    
     return carServ.verCarreras();
    }
        @GetMapping ("/ver/carrerasOrdenadas")
        @ResponseBody
  @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
        public List <Carreras> verCarrerasOrdenadas(){
       
            
            return  carServ.verCarrerasOrdenadas();
   
 
    }
    
        
    @DeleteMapping ("/delete/carreras/{id}")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarCarreras(@PathVariable Long id){
        carServ.borrarCarreras(id);
    }
    
    @PutMapping("/modif/carreras")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarCarreras(@RequestBody Carreras car){
        carServ.modifCarreras(car); }
    
    @GetMapping ("/ver/carFechaCarrera")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <Carreras> verFechaCarrera(){
        return carServ.verCarrerasOrdenadas();
    }
   //PilCatPunt
      
     @Autowired
      IPilCatPuntService  pcpServ;
    @PostMapping ("/pilCatPunt")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarPilCatPunt (@RequestBody PilCatPunt pilcatpunt){
     //   listaCategorias.add(cat);
     pcpServ.crearPilCatPunt(pilcatpunt);
    }
    
    @GetMapping ("/ver/pilCatPunt")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <PilCatPunt> verPilCatPunt(){
    
    
     return pcpServ.verPilCatPunt();
    }
    @DeleteMapping ("/delete/pilCatPunt/{id}")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarPilCatPunt(@PathVariable Long id){
        pcpServ.borrarPilCatPunt(id);
    }
    
    @PutMapping("/modif/pilCatPunt")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarPilCatPunt(@RequestBody PilCatPunt pilcp){
        pcpServ.modifPilCatPunt(pilcp); }
    
     @GetMapping ("/ver/pilCatPuntXPiloto/{Pil}")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List<PilCatPunt> verPilCatPuntX(@PathVariable String Pil){
    
    
     return pcpServ.verPilCatPutxPil(Pil);
    }
    @Autowired
    PilCatPuntRepository PCPR;
    
    @GetMapping("/ver/pilCatPuntXPilotoYXCategoria")
     @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
	public ResponseEntity<List<PilCatPunt>> getPilCatPuntPorNombreyCat(@RequestParam String nombrePilotoPilCatPunt, 
				@RequestParam String idCategoriaPilCatPunt) {
		return new ResponseEntity<List<PilCatPunt>>(PCPR.findByNombrePilotoPilCatPuntAndIdCategoriaPilCatPunt(nombrePilotoPilCatPunt, idCategoriaPilCatPunt), HttpStatus.OK);
	}
    
    
    
    
    
    
     //carreraPiloto
      
     @Autowired
      ICarreraPilotoService  carPilServ;
    @PostMapping ("/carreraPiloto")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarCarreraPiloto (@RequestBody CarreraPiloto carPil){
     //   listaCategorias.add(cat);
     carPilServ.crearCarreraPilotos(carPil);
    }
    
    @GetMapping ("/ver/carreraPiloto")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <CarreraPiloto> verCarreraPiloto(){
    
    
     return carPilServ.verCarreraPilotos();
    }
    @DeleteMapping ("/delete/carreraPiloto/{id}")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarCarreraPiloto(@PathVariable Long id){
        carPilServ.borrarCarreraPilotos(id);
    }
    
    @PutMapping("/modif/carreraPiloto")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarCarreraPiloto(@RequestBody CarreraPiloto carPil){
        carPilServ.modifCarreraPilotos(carPil); }
//PuntosPorCarrera
  @Autowired
      IPuntPorCarreraService  ppcarrServ;
  @Autowired
      PuntPorCarreraRepository ppcarrRepo;
      
    @PostMapping ("/puntPorCarrera")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void agregarPuntPrCarrera (@RequestBody PuntPorCarrera puntPorCarr){
     //   listaCategorias.add(cat);
     ppcarrServ.crearPuntPorCarrera(puntPorCarr);
    }
    
    @GetMapping ("/ver/puntPorCarr")
    @ResponseBody
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public List <PuntPorCarrera> verPuntPorCarrera(){
     return ppcarrServ.verPuntPorCarrera();
    }
    
     @GetMapping ("/ver/puntPorCarrXQYPos")
    
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public ResponseEntity<List<PuntPorCarrera>> getPuntPoCarrXQautosyPos(@RequestParam int autosPPCarreras, 
				@RequestParam int puestoPPCarrera) {
                 
		return new ResponseEntity<>(ppcarrRepo.findByAutosPPCarrerasAndPuestoPPCarrera(autosPPCarreras, puestoPPCarrera), HttpStatus.ACCEPTED);
    }
                                                                            
     @GetMapping ("/ver/puntPorCarrXQ/{qautos}")
    
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void getPuntPoCarr(@PathVariable int autosPPCarreras
				) {
                 
		ppcarrRepo.findByAutosPPCarreras(autosPPCarreras);
    }
    @DeleteMapping ("/delete/puntPorCarreras/{id}")
    @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void borrarPuntPorCarreras(@PathVariable Long id){
        ppcarrServ.borrarPuntPorCarrera(id);
    }
    
    @PutMapping("/modif/puntPorCarrera")
   @CrossOrigin(origins={"http://localhost:4200","https://ranking-backoffice.web.app"} )
    public void modificarPuntPorCarreras(@RequestBody PuntPorCarrera ppcarr){
        ppcarrServ.modifPuntPorCarrera(ppcarr); }
    
      
    
    
}