
package com.backendInventario.ServicesImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backendInventario.DAO.CargoDao;
import com.backendInventario.ModelEntity.Cargo;
import com.backendInventario.Services.CargoService;



@Service
public class CargoServiceImp implements  CargoService{
	
	
	@Autowired
	private CargoDao cargoDao;


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
