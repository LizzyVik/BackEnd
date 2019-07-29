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
import com.backendInventario.ModelEntity.Categoria;
import com.backendInventario.Services.ICategoriasService;


	
	@CrossOrigin(origins = {"http://localhost:4200"})
	@RestController
	@RequestMapping("/categorias")
	public class CategoriaController {
		
		@Autowired
		private ICategoriasService categoriaService;
		
		@GetMapping("/listados")
		public List<Categoria> index(){
			return categoriaService.findAll();
		}
		//Buscar por ID
		@GetMapping("/Buscar/{id}")
		public Categoria show(@PathVariable int id) {
			return categoriaService.findbyId(id);
		}
		// crear categoria
		@PostMapping("/agregar")
		@ResponseStatus(HttpStatus.CREATED)
		public Categoria create(@RequestBody Categoria categoria) {
			return categoriaService.save(categoria);
		}

		@DeleteMapping("/categorias/{id}")
		public void delete(@PathVariable int id) {
			categoriaService.delete(id);
		}
		
		@PutMapping("/categorias/{id}")
		public Categoria update(@RequestBody Categoria categoria,@PathVariable int id){
			Categoria categoriaActual=categoriaService.findbyId(id);
			
			categoriaActual.setCategoria(categoria.getCategoria());
			return categoriaService.save(categoriaActual);
			
			
		}
		
	}


