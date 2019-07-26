package com.backendInventario.ServicesImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backendInventario.DAO.IProductoDAO;
import com.backendInventario.ModelEntity.Producto;
import com.backendInventario.Services.IProductosService;

@Service
public class ProductoServicesImp implements IProductosService {
	
	@Autowired
	private IProductoDAO productoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findbyId(int id) {
		return productoDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productoDao.deleteById(id);		
	}

}
