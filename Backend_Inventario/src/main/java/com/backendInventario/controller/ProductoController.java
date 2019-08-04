package com.backendInventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.backendInventario.model.Producto;
import com.backendInventario.service.IProductoService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller("/producto")
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@GetMapping("productos")
	public ResponseEntity<?> getAllXProductos() {
		List<Producto> lstProductos = productoService.findAll();
		if (lstProductos == null) {

			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			if (lstProductos.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			}
		}
		return new ResponseEntity<List<?>>(lstProductos, HttpStatus.OK);
	}

	@GetMapping("/producto/{id}")
	public ResponseEntity<?> getProductoById(@PathVariable("id") Integer id) {
		if (productoService.existProducto(id)) {
			return new ResponseEntity<Producto>(productoService.findbyId(id), HttpStatus.CREATED);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	@PostMapping("/producto/add")
	public ResponseEntity<?> create(@RequestBody Producto producto) {
		Producto productoResponse = null;
		if (producto == null) {
			return new ResponseEntity<>(null, HttpStatus.PRECONDITION_FAILED);
		} else {
			productoResponse = productoService.save(producto);
			if (productoResponse == null) {
				return new ResponseEntity<Producto>(productoResponse, HttpStatus.CREATED);
			}
		}
		return new ResponseEntity<Producto>(producto, HttpStatus.UNPROCESSABLE_ENTITY);
	}

	@DeleteMapping("/producto/{id}")
	public ResponseEntity<?> deleteProducto(@PathVariable("id") int id) {
		productoService.deleteById(id);
		if (productoService.existProducto(id)) {
			return new ResponseEntity<Producto>(productoService.findbyId(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	@PutMapping("/producto")
	public ResponseEntity<?> updateProducto(@RequestBody Producto producto) {
		Producto productoResponse = null;
		if (producto == null) {
			return new ResponseEntity<>(null, HttpStatus.PRECONDITION_FAILED);
		}
		if (!productoService.existProducto(producto.getId())) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		productoResponse = productoService.save(producto);

		if (productoResponse == null) {
			return new ResponseEntity<Producto>(producto, HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Producto>(productoResponse, HttpStatus.OK);

	}
}