package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.FacturaVenta;

public interface IFacturaVentaRepository extends CrudRepository<FacturaVenta, Integer>  {

}
