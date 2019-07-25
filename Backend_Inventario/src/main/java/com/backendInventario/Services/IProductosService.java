package com.backendInventario.Services;

import java.util.List;

import com.backendInventario.ModelEntity.Productos;

public interface IProductosService {
	
	public List<Productos> findAll();
	
	public Productos findbyId (int id);
	
    public Productos save(Productos producto);
	
	public void delete(int id);

}
