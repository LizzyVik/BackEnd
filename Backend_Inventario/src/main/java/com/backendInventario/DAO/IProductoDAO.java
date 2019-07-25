package com.backendInventario.DAO;
import org.springframework.data.repository.CrudRepository;

import com.backendInventario.ModelEntity.Productos;

public interface IProductoDAO extends CrudRepository<Productos, Integer>{

}
