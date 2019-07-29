package com.backendInventario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.backendInventario.ModelEntity.Producto;
import com.backendInventario.Services.IProductosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductosService productoService;
	
	@GetMapping("/listados")
	public List<Producto> index(){
		return productoService.findAll();
	}
	//Buscar por ID
	@GetMapping("/Buscar/{id}")
	public Producto show(@PathVariable int id) {
		return productoService.findbyId(id);
	}
	// crear Producto
	@PostMapping("/agregar")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		return productoService.save(producto);
	}

	@DeleteMapping("/productos/{id}")
	public void delete(@PathVariable int id) {
		productoService.delete(id);
	}
}
