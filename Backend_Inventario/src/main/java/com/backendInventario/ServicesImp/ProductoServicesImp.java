package com.backendInventario.ServicesImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backendInventario.DAO.IProductoDAO;
import com.backendInventario.ModelEntity.Producto;
import com.backendInventario.Services.IProductosService;

@Service
public class ProductoServicesImp implements IProductosService {
	
	@Autowired
	private IProductoDAO productoDao;

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
