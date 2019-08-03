package com.backendInventario.service;

import java.util.List;

import com.backendInventario.modelo.Cargo;

    public interface ICargoService {
	
    public List<Cargo> findAll();
	
	public Cargo findbyId (int id);
	
    public Cargo save(Cargo cargo);
	
	public void delete(int id);

	public boolean existCargo(Integer id);

}
