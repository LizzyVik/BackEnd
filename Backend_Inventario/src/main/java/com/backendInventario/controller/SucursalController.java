package com.backendInventario.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backendInventario.model.Sucursal;
import com.backendInventario.service.ISucursalService;

@Controller
public class SucursalController {
	@Autowired
	private ISucursalService sucursalservice;
	
	private static final Logger logger = LogManager.getLogger(SucursalController.class);
	
	@GetMapping("sucursal/{id}")
	public ResponseEntity<?> getSucursalById(@Param("id")Integer id){
		Sucursal sucursal = sucursalservice.getSucursales(id);
		if(sucursal==null) {
			return new ResponseEntity<String>("No existe sucursal",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Sucursal>(sucursal,HttpStatus.OK);
	}
	
	@GetMapping("sucursales")
	public ResponseEntity<?> getAllSucursales(){
		List<Sucursal> lstSucursal = sucursalservice.getAllSucursales();
		if(lstSucursal==null) {
			return new  ResponseEntity<String>("No se puede listar",HttpStatus.NOT_FOUND);
		}
		if(lstSucursal.isEmpty()) {
			return new  ResponseEntity<String>("Lista de sucursales vacía",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Sucursal>>(lstSucursal,HttpStatus.OK);
	}
	
	@PostMapping("sucursal/add")
	public ResponseEntity<?> createSucursal(@RequestBody Sucursal sucursal){
		Sucursal sucursalResponse = sucursalservice.createSucursal(sucursal);
		if(sucursalResponse==null) {
			return new  ResponseEntity<String>("No se puede crear Sucursal",HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Sucursal>(sucursalResponse,HttpStatus.OK);
	}
	@PutMapping("sucursal/edit")
	public ResponseEntity<?> actualizarSucursal(@RequestBody Sucursal sucursal){
		Sucursal sucursalResponse = sucursalservice.updateSucursal(sucursal);
		if(sucursalResponse==null) {
			return new  ResponseEntity<String>("No se encuentra sucursal para Actualizar",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Sucursal>(sucursalResponse,HttpStatus.OK);
	}
	
	@DeleteMapping("sucursal/{id}")
	public ResponseEntity<?> updateSucursal(@Param("id")Integer id){
		sucursalservice.deleteSucursal(id);
		return new  ResponseEntity<String>("Id no reconocido, no se puede eliminar sucursal",HttpStatus.NOT_FOUND);
	}
}
