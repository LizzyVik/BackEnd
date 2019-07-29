package com.backendInventario.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backendInventario.ModelEntity.Marca;
import com.backendInventario.Services.IMarcaService;

public class MarcaController {
	@CrossOrigin(origins = {"http://localhost:4200"})
	@RestController
	@RequestMapping("/marcas")

	public class UsuarioController {
		@Autowired
		private IMarcaService marcaservice;
		
		@GetMapping("/listados")
		public List<Marca> index(){
			return marcaservice.findAll();
		}
		//Buscar por ID
		@GetMapping("/Buscar/{id}")
		public Optional<Marca> show(@PathVariable int id) {
			return marcaservice.findById(id);
		}
		// agregar marca
		@PostMapping("/agregar")
		@ResponseStatus(HttpStatus.CREATED)
		public Marca create(@RequestBody Marca marca) {
			return marcaservice.save(marca);
		}

		@DeleteMapping("/marcas/{id}")
		public void delete(@PathVariable int id) {
			marcaservice.delete(id);
		}
		

	}


}
