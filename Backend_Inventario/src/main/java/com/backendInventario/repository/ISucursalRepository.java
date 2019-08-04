package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.Sucursal;

public interface ISucursalRepository extends CrudRepository<Sucursal,Integer> {
	
}
