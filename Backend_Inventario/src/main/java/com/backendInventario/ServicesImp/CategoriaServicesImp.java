package com.backendInventario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.modelo.Categoria;
import com.backendInventario.repository.ICategoriaRepository;
import com.backendInventario.service.ICategoriasService;

@Service
public class CategoriaServicesImp implements  ICategoriasService{
	@Autowired
	private ICategoriaRepository categoriaDao;
	
	@Override
	public List<Categoria> findAll() {
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	public Categoria findbyId(int id) {
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	public Categoria save(Categoria Categoria) {
		return categoriaDao.save(Categoria);
	}

	@Override
	public void delete(int id) {
		categoriaDao.deleteById(id);
	}

	@Override
	public boolean existCategoria(Integer id) {
		return categoriaDao.existsById(id);
	}

}
