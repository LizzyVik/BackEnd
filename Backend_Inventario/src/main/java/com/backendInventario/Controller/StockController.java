package com.backendInventario.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.backendInventario.ModelEntity.Stock;
import com.backendInventario.Services.IStockService;


@Controller("/stock")
public class StockController {
	
	@Autowired
	private IStockService stockService;
	
	@GetMapping("allstock")
	public ResponseEntity<?> getAllXStock(){
		List<Stock> lstStock = stockService.findAll();
		if (lstStock== null) {
			
			return new  ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}else {
			if (lstStock.isEmpty()) {
				return new  ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			}
		}
		return new  ResponseEntity<List<?>>(lstStock, HttpStatus.OK);
	}
	
	
	@GetMapping("/stock/{id}")
	public ResponseEntity<?> getStockById(@PathVariable("id") Integer id) {
		if (stockService.existStock(id)) {
			return new ResponseEntity<Stock>(stockService.findById(id), HttpStatus.CREATED); 
		}
		return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/stock/add")
	public ResponseEntity<?> create(@RequestBody Stock stock) {
		Stock stockResponse = null;
		if(stock==null) {
			return new ResponseEntity<>(null,HttpStatus.PRECONDITION_FAILED);
		}else {
			stockResponse = stockService.save(stock);
			if (stockResponse == null) {
				return new ResponseEntity<Stock>(stockResponse, HttpStatus.CREATED); 
			}
		}
		return new ResponseEntity<Stock>(stock,HttpStatus.UNPROCESSABLE_ENTITY);
	}

	@DeleteMapping("/stock/{id}")
	public ResponseEntity<?> deleteStock(@PathVariable("id") int id) {
		stockService.deleteById(id);
		if(stockService.existStock(id)) {
			return new ResponseEntity<Stock>(stockService.findById(id),HttpStatus.OK);
		}
		return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/stock")
	public ResponseEntity<?> updateStock(@RequestBody Stock stock){
		Stock stockResponse = null;
		if(stock == null) {
			return new ResponseEntity<>(null,HttpStatus.PRECONDITION_FAILED);
		} 
		if(!stockService.existStock(stock.getId())) {
			return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		stockResponse = stockService.save(stock);
		 
		if (stockResponse== null) {
			return new ResponseEntity<Stock>(stock,HttpStatus.UNPROCESSABLE_ENTITY);	
		}
		return new ResponseEntity<Stock>(stockResponse,HttpStatus.OK);
		
	}
}