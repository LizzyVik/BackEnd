package com.backendInventario.DAO;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.ModelEntity.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Integer>{

}
