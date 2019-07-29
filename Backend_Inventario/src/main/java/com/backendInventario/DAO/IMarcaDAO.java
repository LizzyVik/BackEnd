package com.backendInventario.DAO;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.ModelEntity.Marca;

public interface IMarcaDAO extends CrudRepository<Marca, Integer> {

}
