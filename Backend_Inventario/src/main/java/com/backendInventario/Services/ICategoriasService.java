package com.backendInventario.service;

import java.util.List;

import com.backendInventario.modelo.Categoria;

    public interface ICategoriasService {

	public List<Categoria> findAll();
	
	public Categoria findbyId (int id);
	
    public Categoria save(Categoria categoria);
	
	public void delete(int id);

	public boolean existCategoria(Integer id);
}
