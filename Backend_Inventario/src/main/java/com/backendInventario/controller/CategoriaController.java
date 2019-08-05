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

import com.backendInventario.model.Categoria;
import com.backendInventario.service.ICategoriaService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaService categoriaService;

	@GetMapping("categorias")
	public ResponseEntity<?> getAllXCategorias() {
		List<Categoria> lstCategorias = categoriaService.findAll();
		if (lstCategorias == null) {

			return new ResponseEntity<String>("No se pueden listar categorías", HttpStatus.NOT_FOUND);
		} else {
			if (lstCategorias.isEmpty()) {
				return new ResponseEntity<String>("Lista de categorías vacía", HttpStatus.NOT_FOUND);
			}
		}
		return new ResponseEntity<List<?>>(lstCategorias, HttpStatus.OK);
	}

	@GetMapping("/categoria/{id}")
	public ResponseEntity<?> getCategoriaById(@PathVariable("id") Integer id) {
		if (categoriaService.existCategoria(id)) {
			return new ResponseEntity<Categoria>(categoriaService.findbyId(id), HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Id de categoría no encontrada", HttpStatus.NOT_FOUND);
	}

	@PostMapping("/categoria/add")
	public ResponseEntity<?> create(@RequestBody Categoria categoria) {
		Categoria categoriaresponse = null;
		if (categoria == null) {
			return new ResponseEntity<String>("No se puede agregar categoría", HttpStatus.PRECONDITION_FAILED);
		}
		categoriaresponse = categoriaService.save(categoria);
		if (categoriaresponse == null) {
			return new ResponseEntity<String>("No se puede ejecutar la transacción", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Categoria>(categoriaresponse, HttpStatus.OK);
	}

	@DeleteMapping("/categoria/{id}")
	public ResponseEntity<?> deleteCategoria(@PathVariable("id") int id) {
		categoriaService.delete(id);
		if (categoriaService.existCategoria(id)) {
			return new ResponseEntity<Categoria>(categoriaService.findbyId(id), HttpStatus.OK);
		}
		return new ResponseEntity<String>("Id de categoría no encontrada", HttpStatus.NOT_FOUND);
	}

	@PutMapping("/categoria")
	public ResponseEntity<?> updateCategoria(@RequestBody Categoria categoria) {
		Categoria categoriaresponse = null;
		if (categoria == null) {
			return new ResponseEntity<String>("No se puede actualizar", HttpStatus.PRECONDITION_FAILED);
		}
		if (!categoriaService.existCategoria(categoria.getId())) {
			return new ResponseEntity<String>("Id no encontrada", HttpStatus.NOT_FOUND);
		}
		categoriaresponse = categoriaService.save(categoria);

		if (categoriaresponse == null) {
			return new ResponseEntity<String>("No se pudo ejecutar la transacción", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Categoria>(categoriaresponse, HttpStatus.OK);

	}

}
