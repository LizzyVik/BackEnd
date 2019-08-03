package com.backendInventario.service;

import java.util.List;

import com.backendInventario.model.Categoria;

public interface ICategoriaService {

	public List<Categoria> findAll();

	public Categoria findbyId(int id);

	public Categoria save(Categoria Categoria);

	public void delete(int id);

	public boolean existCategoria(Integer id);

}
