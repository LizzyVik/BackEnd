package com.backendInventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.BoletaVenta;
import com.backendInventario.repository.IBoletaVentaRepository;
import com.backendInventario.service.IBoletaVentaService;


@Service
public class BoletaVentaServiceImp implements  IBoletaVentaService{

	@Autowired
	private IBoletaVentaRepository boletaventarepository;
	
	public BoletaVenta crearBoletaVenta(BoletaVenta boletaventa) {
		return boletaventarepository.save(boletaventa);
	}
}
