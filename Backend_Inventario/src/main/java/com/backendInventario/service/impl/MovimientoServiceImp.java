package com.backendInventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.Movimiento;
import com.backendInventario.repository.IMovimientoRepository;
import com.backendInventario.service.IMovimientoService;

@Service
public class MovimientoServiceImp  implements IMovimientoService{

	@Autowired
	private IMovimientoRepository movimientorepository;
	
	
	@Override
	public void delete(Integer id) {
		movimientorepository.deleteById(id);
		
	}
	@Override
	public Movimiento save(Movimiento movimiento) {
		return movimientorepository.save(movimiento);
	}
}
