package com.backendInventario.Controller;

import java.util.List;

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

import com.backendInventario.ModelEntity.Producto;
import com.backendInventario.ModelEntity.Usuario;
import com.backendInventario.Services.UsuarioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/usuario")

public class UsuarioController {
	@Autowired
	private UsuarioService userservice;
	@GetMapping("/listados")
	public List<Usuario> index(){
		return userservice.findAll();
	}
	//Buscar por ID
	@GetMapping("/Buscar/{id}")
	public Usuario show(@PathVariable int id) {
		return userservice.findbyId(id);
	}
	// crear Producto
	@PostMapping("/agregar")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario user) {
		return userservice.save(user);
	}

	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable int id) {
		userservice.delete(id);
	}
	

}
