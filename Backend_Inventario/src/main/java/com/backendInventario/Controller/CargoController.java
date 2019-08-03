package com.backendInventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backendInventario.modelo.Cargo;
import com.backendInventario.service.ICargoService;


@Controller("/cargo")
public class CargoController {
		
		@Autowired
		private ICargoService cargoService;
		
		@GetMapping("cargos")
		public ResponseEntity<?> getAllXCargos(){
			List<Cargo> lstCargos = cargoService.findAll();
			if (lstCargos== null) {
				
				return new  ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			}else {
				if (lstCargos.isEmpty()) {
					return new  ResponseEntity<>(null, HttpStatus.NOT_FOUND);
				}
			}
			return new  ResponseEntity<List<?>>(lstCargos, HttpStatus.OK);
		}
		
		
		@GetMapping("/cargo/{id}")
		public ResponseEntity<?> getCargoById(@PathVariable("id") Integer id) {
			if (cargoService.existCargo(id)) {
				return new ResponseEntity<Cargo>(cargoService.findbyId(id), HttpStatus.CREATED); 
			}
			return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		@PostMapping("/cargo/add")
		public ResponseEntity<?> create(@RequestBody Cargo cargo) {
			Cargo cargoResponse = null;
			if(cargo==null) {
				return new ResponseEntity<>(null,HttpStatus.PRECONDITION_FAILED);
			}else {
				cargoResponse = cargoService.save(cargo);
				if (cargoResponse == null) {
					return new ResponseEntity<Cargo>(cargoResponse, HttpStatus.CREATED); 
				}
			}
			return new ResponseEntity<Cargo>(cargo,HttpStatus.UNPROCESSABLE_ENTITY);
		}

		@DeleteMapping("/cargo/{id}")
		public ResponseEntity<?> deleteCargo(@PathVariable("id") int id) {
			cargoService.delete(id);
			if(cargoService.existCargo(id)) {
				return new ResponseEntity<Cargo>(cargoService.findbyId(id),HttpStatus.OK);
			}
			return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		@PutMapping("/cargo")
		public ResponseEntity<?> updateCargo(@RequestBody Cargo cargo){
			Cargo cargoresponse = null;
			if(cargo == null) {
				return new ResponseEntity<>(null,HttpStatus.PRECONDITION_FAILED);
			} 
			if(!cargoService.existCargo(cargo.getId())) {
				return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			}
			cargoresponse = cargoService.save(cargo);
			 
			if (cargoresponse== null) {
				return new ResponseEntity<Cargo>(cargo,HttpStatus.UNPROCESSABLE_ENTITY);	
			}
			return new ResponseEntity<Cargo>(cargoresponse,HttpStatus.OK);
			
		}
		
	
}
