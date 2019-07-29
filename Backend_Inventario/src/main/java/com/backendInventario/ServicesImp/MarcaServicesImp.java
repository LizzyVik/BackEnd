package com.backendInventario.ServicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.DAO.IMarcaDAO;
import com.backendInventario.ModelEntity.Marca;
import com.backendInventario.Services.IMarcaService;

@Service
public class MarcaServicesImp implements IMarcaService{
	
	@Autowired
	private IMarcaDAO marcaDao;

	@Override
	public List<Marca> findAll() {
		return (List<Marca>) marcaDao.findAll() ;
	}

	@Override
	public Optional<Marca> findById(int id) {
		return marcaDao.findById(id);
	}

	@Override
	public Marca save(Marca marca) {
		return marcaDao.save(marca);
	}

	@Override
	public void delete(int id) {
		marcaDao.deleteById(id);
		
	}

}
