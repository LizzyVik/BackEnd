package com.backendInventario.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.backendInventario.DAO.CargoDao;
import com.backendInventario.ModelEntity.Cargo;
import com.backendInventario.Services.CargoService;

public class CargoServiceImp implements  CargoService{
	
	
	@Autowired
	private CargoDao cargoDao;


	@Override
	@Transactional(readOnly=true)
	public List<Cargo> findAll() {
		return (List<Cargo>) cargoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cargo findbyId(int id) {
		return cargoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Cargo save(Cargo cargo) {
		return cargoDao.save(cargo);
	}

	@Override
	@Transactional(readOnly=true)
	public void delete(int id) {
		cargoDao.deleteById(id);
	}

	

}
