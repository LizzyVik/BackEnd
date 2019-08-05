package com.backendInventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.backendInventario.Enum.ETipoMovimiento;
import com.backendInventario.model.Movimiento;
import com.backendInventario.repository.IMovimientoRepository;
import com.backendInventario.service.IMovimientoService;

public class MovimientoServiceImp  implements IMovimientoService{

	@Autowired
	private IMovimientoRepository movimientorepository;
	
	public Movimiento crearVenta(Movimiento movimiento){
		movimiento.setTipoMovimiento(ETipoMovimiento.Venta.getCodTipoVenta());
		return movimientorepository.save(movimiento);
	}
	public Movimiento crearCompra(Movimiento movimiento){
		movimiento.setTipoMovimiento(ETipoMovimiento.Venta.getCodTipoVenta());
		return movimientorepository.save(movimiento);
	}
}
