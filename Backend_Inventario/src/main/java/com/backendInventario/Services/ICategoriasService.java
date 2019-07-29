package com.backendInventario.Services;

import java.util.List;

import com.backendInventario.ModelEntity.Categoria;

    public interface ICategoriasService {

	public List<Categoria> findAll();
	
	public Categoria findbyId (int id);
	
    public Categoria save(Categoria categoria);
	
	public void delete(int id);
}
