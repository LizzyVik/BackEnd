package com.backendInventario.Services;

import java.util.List;

import com.backendInventario.ModelEntity.Producto;

public interface IProductosService {
	
	public List<Producto> findAll();
	
	public Producto findbyId (int id);
	
    public Producto save(Producto producto);
	
	public void delete(int id);

}
