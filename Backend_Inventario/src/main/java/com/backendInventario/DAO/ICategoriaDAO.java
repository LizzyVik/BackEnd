package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.modelo.Categoria;

public interface ICategoriaRepository extends CrudRepository<Categoria, Integer>{

}
