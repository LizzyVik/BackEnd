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

import com.backendInventario.model.Marca;
import com.backendInventario.service.IMarcaService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller("/marca")
public class MarcaController {

	@Autowired
	private IMarcaService marcaService;

	@GetMapping("marcas")
	public ResponseEntity<?> getAllXProductos() {
		List<Marca> lstMarcas = marcaService.findAll();
		if (lstMarcas == null) {

			return new ResponseEntity<String>("No se puede listar marcas", HttpStatus.NOT_FOUND);
		} else {
			if (lstMarcas.isEmpty()) {
				return new ResponseEntity<String>("Listas de marcas vacía", HttpStatus.NOT_FOUND);
			}
		}
		return new ResponseEntity<List<?>>(lstMarcas, HttpStatus.OK);
	}

	@GetMapping("/marca/{id}")
	public ResponseEntity<?> getMarcaById(@PathVariable("id") Integer id) {
		if (marcaService.existMarca(id)) {
			return new ResponseEntity<Marca>(marcaService.findById(id), HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Id de marca no encontrada", HttpStatus.NOT_FOUND);
	}

	@PostMapping("/marca/add")
	public ResponseEntity<?> create(@RequestBody Marca marca) {
		Marca marcaResponse = null;
		if (marca == null) {
			return new ResponseEntity<String>("No se puede crear marca", HttpStatus.PRECONDITION_FAILED);
		} else {
			marcaResponse = marcaService.save(marca);
			if (marcaResponse == null) {
				return new ResponseEntity<Marca>(marcaResponse, HttpStatus.CREATED);
			}
		}
		return new ResponseEntity<String>("No se puede ejecutar la transacción", HttpStatus.UNPROCESSABLE_ENTITY);
	}

	@DeleteMapping("/marca/{id}")
	public ResponseEntity<?> deleteMarca(@PathVariable("id") int id) {
		marcaService.delete(id);
		if (marcaService.existMarca(id)) {
			return new ResponseEntity<Marca>(marcaService.findById(id), HttpStatus.OK);
		}
		return new ResponseEntity<String>("Id de marca no encontrada", HttpStatus.NOT_FOUND);
	}

	@PutMapping("/marca")
	public ResponseEntity<?> updateMarca(@RequestBody Marca marca) {
		Marca marcaResponse = null;
		if (marca == null) {
			return new ResponseEntity<String>("No se puede actualizar la información", HttpStatus.PRECONDITION_FAILED);
		}
		if (!marcaService.existMarca(marca.getId())) {
			return new ResponseEntity<String>("Id de marca no encontrada", HttpStatus.NOT_FOUND);
		}
		marcaResponse = marcaService.save(marca);

		if (marcaResponse == null) {
			return new ResponseEntity<String>("No se puede ejecutar la transacción", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		else
		return new ResponseEntity<Marca>(marcaResponse, HttpStatus.OK);

	}
}