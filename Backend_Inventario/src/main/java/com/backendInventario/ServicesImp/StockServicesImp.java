package com.backendInventario.ServicesImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.DAO.IStockDAO;
import com.backendInventario.ModelEntity.Stock;
import com.backendInventario.Services.IStockService;

@Service
public class StockServicesImp implements IStockService{
	
	@Autowired
	private IStockDAO stockDao;

	@Override
	public List<Stock> findAll() {
		return (List<Stock>) stockDao.findAll();
	}

	@Override
	public Stock findById(int id) {
		return stockDao.findById(id).orElse(null);
	}

	@Override
	public Stock save(Stock stock) {
		return stockDao.save(stock);
	}

	@Override
	public void deleteById(int id) {
		stockDao.deleteById(id);
		
	}

	@Override
	public boolean existStock(Integer id) {
		return stockDao.existsById(id);
	}
    
	
		
	}
	


