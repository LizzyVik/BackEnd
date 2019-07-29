package com.backendInventario.Services;

import java.util.List;
import java.util.Optional;

import com.backendInventario.ModelEntity.Marca;

public interface IMarcaService {
	
    public List<Marca> findAll();
	
	public Optional<Marca> findById (int id);
	
    public Marca save(Marca marca);
	
	public void delete(int id);


}
