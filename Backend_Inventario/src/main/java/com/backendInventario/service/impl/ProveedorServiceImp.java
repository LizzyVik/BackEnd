package com.backendInventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.Proveedor;
import com.backendInventario.repository.IProveedorRepository;
import com.backendInventario.service.IProveedorService;

@Service
public class ProveedorServiceImp implements IProveedorService{
	@Autowired
	private IProveedorRepository proveedorrepository;
	
	public Proveedor crearProveedor(Proveedor proveedor) {
		return proveedorrepository.save(proveedor);
	}
}
