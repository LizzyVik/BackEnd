package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.Marca;

public interface IMarcaRepository extends CrudRepository<Marca, Integer> {

}
