package com.backendInventario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.Sucursal;
import com.backendInventario.repository.ISucursalRepository;
import com.backendInventario.service.ISucursalService;

@Service
public class SucursalServiceImp implements ISucursalService {
	 
	@Autowired
	private ISucursalRepository sucursalRepository;
	
	@Override
	public List<Sucursal>  getAllSucursales() {
		return (List<Sucursal>)sucursalRepository.findAll();
	}
	@Override
	public Sucursal getSucursales(Integer id) {
		return (Sucursal)sucursalRepository.findById(id).get();
	}
	@Override
	public Sucursal createSucursal(Sucursal sucursal) {
		return sucursalRepository.save(sucursal);
	}
	
	@Override
	public Sucursal updateSucursal(Sucursal sucursal) {
		if (sucursal.getId()==null) {
			if (!sucursalRepository.existsById(sucursal.getId())) {
				return null;
			}
		}
		return sucursalRepository.save(sucursal);
	}
	@Override
	public void deleteSucursal(Integer id) {
		sucursalRepository.deleteById(id);
	}
}
