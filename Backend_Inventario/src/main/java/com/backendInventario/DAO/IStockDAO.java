package com.backendInventario.DAO;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.ModelEntity.Stock;

public interface IStockDAO extends CrudRepository <Stock, Integer> {

}
