package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.Proveedor;

public interface IProveedorRepository extends CrudRepository<Proveedor, Integer> {

}
