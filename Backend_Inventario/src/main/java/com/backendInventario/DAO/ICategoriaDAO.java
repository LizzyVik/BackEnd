package com.backendInventario.DAO;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.ModelEntity.Categorias;

public interface ICategoriaDAO extends CrudRepository<Categorias, Integer>{

}
