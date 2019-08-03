package com.backendInventario.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.modelo.Producto;
import com.backendInventario.repository.IProductoRepository;
import com.backendInventario.service.IProductosService;

@Service
public class ProductoServicesImp implements IProductosService {
	
	@Autowired
	private IProductoRepository productoDao;

	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findbyId(int id) {
		return productoDao.findById(id).orElse(null);
		
	}

	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public void deleteById(int id) {
		productoDao.deleteById(id);		
	}

	@Override
	public boolean existProducto(Integer id) {
		return productoDao.existsById(id);
	}

	
}
