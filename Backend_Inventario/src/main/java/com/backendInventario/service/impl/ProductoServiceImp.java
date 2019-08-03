package com.backendInventario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.Producto;
import com.backendInventario.repository.IProductoRepository;
import com.backendInventario.service.IProductoService;

@Service
public class ProductoServiceImp  implements IProductoService {
	
	@Autowired
	private IProductoRepository productorepository;

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productorepository.findAll();
	}

	@Override
	public Producto findbyId(int id) {
		return productorepository.findById(id).orElse(null);
		
	}

	@Override
	public Producto save(Producto producto) {
		return productorepository.save(producto);
	}

	@Override
	public void deleteById(int id) {
		productorepository.deleteById(id);		
	}

	@Override
	public boolean existProducto(Integer id) {
		return productorepository.existsById(id);
	}
}
