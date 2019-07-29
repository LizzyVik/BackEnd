package com.backendInventario.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.backendInventario.ModelEntity.Stock;
import com.backendInventario.Services.IStockService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	private IStockService stockService;
	
	@GetMapping("/listados")
	public List<Stock> index(){
		return stockService.findAll();
	}
	//Buscar por ID
	@GetMapping("/Buscar/{id}")
	public Optional<Stock> show(@PathVariable int id) {
		return stockService.findById(id);
	}
	// agregar stock
	@PostMapping("/agregar")
	@ResponseStatus(HttpStatus.CREATED)
	public Stock create(@RequestBody Stock stock) {
		return stockService.save(stock);
	}

	@DeleteMapping("/stock/{id}")
	public void deleteById(@PathVariable int id) {
		stockService.deleteById(id);
	}
	
	
	
	@ExceptionHandler
	public static void stockException(int cantidadActual){
        if((cantidadActual>20)){
            throw new ArithmeticException("Bajo Stock Del Producto");
        }
        else{
            System.out.print("");
        }
    }
	
	
}


