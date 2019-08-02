package com.backendInventario.Services;

import java.util.List;


import com.backendInventario.ModelEntity.Stock;


public interface IStockService {
		
		public List<Stock> findAll();
		
		public Stock findById (int id);
		
	    public Stock save(Stock stock);
		
		public void deleteById(int id);

		public boolean existStock(Integer id);

	


}
