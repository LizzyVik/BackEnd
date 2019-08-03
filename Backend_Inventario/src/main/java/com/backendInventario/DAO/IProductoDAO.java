package com.backendInventario.repository;
import org.springframework.data.repository.CrudRepository;

import com.backendInventario.modelo.Producto;


public interface IProductoRepository extends CrudRepository<Producto, Integer>{

}
