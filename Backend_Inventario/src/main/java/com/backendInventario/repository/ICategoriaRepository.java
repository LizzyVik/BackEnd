package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.Categoria;

public interface ICategoriaRepository extends CrudRepository<Categoria, Integer>{

}
