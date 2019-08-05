package com.backendInventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backendInventario.model.Usuario;
import com.backendInventario.service.IUsuarioService;


@CrossOrigin(origins = "http://localhost:4200")
@Controller("/usuario")
public class UsuarioController {
	@Autowired
	private IUsuarioService userService;

	@GetMapping("usuarios")
	public ResponseEntity<?> getAllXUsuarios() {
		List<Usuario> lstUsuarios = userService.findAll();
		if (lstUsuarios == null) {

			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			if (lstUsuarios.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			}
		}
		return new ResponseEntity<List<?>>(lstUsuarios, HttpStatus.OK);
	}

	@GetMapping("/usuario{id}")
	public ResponseEntity<?> getUsuarioById(@PathVariable("id") Integer id) {
		if (userService.existUsuario(id)) {
			return new ResponseEntity<Usuario>(userService.findbyId(id), HttpStatus.CREATED);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	@PostMapping("/usuario/add")
	public ResponseEntity<?> create(@RequestBody Usuario usuario) {
		Usuario userResponse = null;
		if (usuario == null) {
			return new ResponseEntity<>(null, HttpStatus.PRECONDITION_FAILED);
		} else {
			userResponse = userService.save(usuario);
			if (userResponse == null) {
				return new ResponseEntity<Usuario>(userResponse, HttpStatus.CREATED);
			}
		}
		return new ResponseEntity<Usuario>(usuario, HttpStatus.UNPROCESSABLE_ENTITY);
	}

	@PostMapping("/usuario/validate")
	public ResponseEntity<?> validateUser(@RequestBody Usuario usuario) {
		if (usuario == null) {
			return new ResponseEntity<String>("No se recibio E-mail y Password", HttpStatus.PRECONDITION_FAILED);
		} else {
			if(userService.existUserByEmailAndPassword(usuario)==1) {
				return new ResponseEntity<Usuario>(userService.findUserByEmailAndPassword(usuario), HttpStatus.CREATED);
			}
			return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
		}
	}
	@DeleteMapping("/usuario/{id}")
	public ResponseEntity<?> deleteUsuario(@PathVariable("id") int id) {
		userService.delete(id);
		if (userService.existUsuario(id)) {
			return new ResponseEntity<Usuario>(userService.findbyId(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	@PutMapping("/usuario")
	public ResponseEntity<?> updateUsuario(@RequestBody Usuario usuario) {
		Usuario userResponse = null;
		if (usuario == null) {
			return new ResponseEntity<>(null, HttpStatus.PRECONDITION_FAILED);
		}
		if (!userService.existUsuario(usuario.getId())) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		userResponse = userService.save(usuario);

		if (userResponse == null) {
			return new ResponseEntity<Usuario>(usuario, HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Usuario>(userResponse, HttpStatus.OK);

	}

}
