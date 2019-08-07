package com.backendInventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.FacturaCompra;
import com.backendInventario.repository.IFacturaCompraRepository;
import com.backendInventario.service.IFacturaCompraService;

@Service
public class FacturaCompraServiceImp implements IFacturaCompraService {
	
	@Autowired
	private IFacturaCompraRepository facturacomprarepository;

	public FacturaCompra crearFacturaCompra(FacturaCompra facturacompra) {
		return facturacomprarepository.save(facturacompra);
	}
}
