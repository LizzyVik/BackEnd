package com.backendInventario.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.modelo.Marca;
import com.backendInventario.repository.IMarcaRepository;
import com.backendInventario.service.IMarcaService;

@Service
public class MarcaServicesImp implements IMarcaService{
	
	@Autowired
	private IMarcaRepository marcaDao;

	@Override
	public List<Marca> findAll() {
		return (List<Marca>) marcaDao.findAll() ;
	}

	
	@Override
	public Marca save(Marca marca) {
		return marcaDao.save(marca);
	}

	@Override
	public void delete(int id) {
		marcaDao.deleteById(id);
		
	}

	@Override
	public boolean existMarca(Integer id) {
		return marcaDao.existsById(id);
	}


	@Override
	public Marca findById(Integer id) {
		return marcaDao.findById(id).orElse(null);
	}


	

}
