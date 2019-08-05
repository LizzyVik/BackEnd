package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.Movimiento;

public interface IMovimientoRepository extends CrudRepository<Movimiento,Integer> {

}
