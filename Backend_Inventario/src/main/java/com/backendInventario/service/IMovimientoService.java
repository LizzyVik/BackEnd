package com.backendInventario.service;

import com.backendInventario.model.Movimiento;

public interface IMovimientoService {
	
	public Movimiento save(Movimiento movimiento);
	
	public void delete(Integer id);

}
