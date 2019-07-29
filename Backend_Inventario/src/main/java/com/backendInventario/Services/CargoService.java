package com.backendInventario.Services;

import java.util.List;

import com.backendInventario.ModelEntity.Cargo;

    public interface CargoService {
	
    public List<Cargo> findAll();
	
	public Cargo findbyId (int id);
	
    public Cargo save(Cargo cargo);
	
	public void delete(int id);
	

}
