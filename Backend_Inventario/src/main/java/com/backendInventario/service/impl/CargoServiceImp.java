
package com.backendInventario.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.modelo.Cargo;
import com.backendInventario.repository.ICargoRepository;
import com.backendInventario.service.ICargoService;



@Service
public class CargoServiceImp implements  ICargoService{
	
	
	@Autowired
	private ICargoRepository cargoDao;


	@Override
	public List<Cargo> findAll() {
		return (List<Cargo>) cargoDao.findAll();
	}

	@Override
	public Cargo findbyId(int id) {
		return cargoDao.findById(id).orElse(null);
	}

	@Override
	public Cargo save(Cargo cargo) {
		return cargoDao.save(cargo);
	}

	@Override
	public void delete(int id) {
		cargoDao.deleteById(id);
	}
	
	@Override
	public boolean existCargo( Integer id) {
		return cargoDao.existsById(id);
	} 
	
	

}
