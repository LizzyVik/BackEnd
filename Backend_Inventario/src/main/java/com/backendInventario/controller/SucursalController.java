package com.backendInventario.controller;

import java.util.List;

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
	
	@GetMapping("sucursal/{id}")
	public ResponseEntity<Sucursal> getSucursalById(@Param("id")Integer id){
		Sucursal sucursal = sucursalservice.getSucursales(id);
		if(sucursal==null) {
			return new  ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Sucursal>(sucursal,HttpStatus.OK);
	}
	
	@GetMapping("sucursales")
	public ResponseEntity<List<Sucursal>> getAllSucursales(){
		List<Sucursal> lstSucursal = sucursalservice.getAllSucursales();
		if(lstSucursal==null) {
			return new  ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		if(lstSucursal.isEmpty()) {
			return new  ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Sucursal>>(lstSucursal,HttpStatus.OK);
	}
	
	@PostMapping("sucursal/add")
	public ResponseEntity<Sucursal> createSucursal(@RequestBody Sucursal sucursal){
		Sucursal sucursalResponse = sucursalservice.createSucursal(sucursal);
		if(sucursalResponse==null) {
			return new  ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Sucursal>(sucursalResponse,HttpStatus.OK);
	}
	@PutMapping("sucursal/edit")
	public ResponseEntity<Sucursal> actualizarSucursal(@RequestBody Sucursal sucursal){
		Sucursal sucursalResponse = sucursalservice.updateSucursal(sucursal);
		if(sucursalResponse==null) {
			return new  ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Sucursal>(sucursalResponse,HttpStatus.OK);
	}
	
	@DeleteMapping("sucursal/{id}")
	public ResponseEntity<Sucursal> updateSucursal(@Param("id")Integer id){
		sucursalservice.deleteSucursal(id);
		return new  ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
}
