package com.backendInventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.FacturaVenta;
import com.backendInventario.repository.IFacturaVentaRepository;
import com.backendInventario.service.IFacturaVentaService;

@Service
public class FacturaVentaServiceImp implements IFacturaVentaService {

	@Autowired
	private IFacturaVentaRepository facturaventarepository;
	
	public FacturaVenta crearFacturaVenta(FacturaVenta facturaventa) {
		return facturaventarepository.save(facturaventa);
	}
}
