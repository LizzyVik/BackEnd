package com.backendInventario.service;

import java.util.List;

import com.backendInventario.model.Producto;

    public interface IProductosService {
	
	public List<Producto> findAll();
	
	public Producto findbyId (int id);
	
    public Producto save(Producto producto);
	
	public boolean existProducto(Integer id);

	public void deleteById(int id);

	

}
