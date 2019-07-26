package com.backendInventario.DAO;
import org.springframework.data.repository.CrudRepository;

import com.backendInventario.ModelEntity.Producto;


public interface IProductoDAO extends CrudRepository<Producto, Integer>{

}
