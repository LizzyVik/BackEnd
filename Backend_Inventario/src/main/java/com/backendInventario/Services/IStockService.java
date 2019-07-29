package com.backendInventario.Services;

import java.util.List;
import java.util.Optional;

import com.backendInventario.ModelEntity.Stock;


public interface IStockService {
		
		public List<Stock> findAll();
		
		public Optional<Stock> findById (int id);
		
	    public Stock save(Stock stock);
		
		public void deleteById(int id);

	


}
