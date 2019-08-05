package com.backendInventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.backendInventario.Enum.ETipoMovimiento;
import com.backendInventario.model.Movimiento;
import com.backendInventario.service.IMovimientoService;

@CrossOrigin(origins="http://localhost:4200")
@Controller("/compra")
public class compraController {
	
	@Autowired
	private IMovimientoService movimientoService;

	
	public Movimiento crearCompra(Movimiento movimiento){
		movimiento.setTipoMovimiento(ETipoMovimiento.Venta.getCodTipoVenta());
		return movimientoService.save(movimiento);
	}
	/*public void deleteCompra(Integer id) {
		id.setTipoMovimiento(ETipoMovimiento.Venta.getCodTipoVenta());
		
		
		
	}*/
}
