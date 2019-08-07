package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.FacturaCompra;

public interface IFacturaCompraRepository extends CrudRepository<FacturaCompra, Integer> {

}
