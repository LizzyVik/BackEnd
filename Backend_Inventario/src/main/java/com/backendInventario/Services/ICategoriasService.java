package com.backendInventario.Services;

import java.util.List;

import com.backendInventario.ModelEntity.Categorias;

public interface ICategoriasService {

	
	public List<Categorias> findAll();
	
	public Categorias findbyId (int id);
	
    public Categorias save(Categorias producto);
	
	public void delete(int id);
}
