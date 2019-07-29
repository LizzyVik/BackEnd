package com.backendInventario.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.backendInventario.DAO.ICategoriaDAO;
import com.backendInventario.ModelEntity.Categoria;
import com.backendInventario.Services.ICategoriasService;

@Service
public class CategoriaServicesImp implements  ICategoriasService{
	@Autowired
	private ICategoriaDAO CategoriaDao;
	
	public List<Categoria> findAll() {
		return (List<Categoria>) CategoriaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Categoria findbyId(int id) {
		return CategoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Categoria save(Categoria Categoria) {
		return CategoriaDao.save(Categoria);
	}

	@Override
	@Transactional(readOnly=true)
	public void delete(int id) {
		CategoriaDao.deleteById(id);
	}

}
