package com.backendInventario.service;

import java.util.List;

import com.backendInventario.modelo.Marca;


public interface IMarcaService {
	
    public List<Marca> findAll();
	
    public Marca save(Marca marcaActual);
	
	public void delete(int id);

	public boolean existMarca(Integer id);

	public Marca findById(Integer id);


	
	


}
