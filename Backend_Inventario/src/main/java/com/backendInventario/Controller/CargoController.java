package com.backendInventario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backendInventario.ModelEntity.Cargo;
import com.backendInventario.Services.CargoService;

public class CargoController {
	
	@CrossOrigin(origins = {"http://localhost:4200"})
	@RestController
	@RequestMapping("/cargos")
	public class ProductoController {
		
		@Autowired
		private CargoService cargoService;
		
		@GetMapping("/listados")
		public List<Cargo> index(){
			return cargoService.findAll();
		}
		//Buscar por ID
		@GetMapping("/Buscar/{id}")
		public Cargo show(@PathVariable int id) {
			return cargoService.findbyId(id);
		}
		// crear Cargo
		@PostMapping("/agregar")
		@ResponseStatus(HttpStatus.CREATED)
		public Cargo create(@RequestBody Cargo cargo) {
			return cargoService.save(cargo);
		}

		@DeleteMapping("/cargos/{id}")
		public void delete(@PathVariable int id) {
			cargoService.delete(id);
		}
		
		@PutMapping("/cargos/{id}")
		public Cargo update(@RequestBody Cargo cargo,@PathVariable int id){
			Cargo cargoActual=cargoService.findbyId(id);
			
			cargoActual.setCargo(cargo.getCargo());
			return cargoService.save(cargoActual);
			
			
		}
		
	}


}
