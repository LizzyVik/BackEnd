package com.backendInventario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.modelo.Usuario;
import com.backendInventario.repository.IUsuarioRepository;
import com.backendInventario.service.IUsuarioService;
@Service
public class UsuarioServicesImp implements IUsuarioService {

	@Autowired 
	private IUsuarioRepository daoUser;
	
	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) daoUser.findAll();
	}

	@Override
	public Usuario findbyId(int id) {
		return daoUser.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario user) {
		return daoUser.save(user);
	}

	@Override
	public void delete(int id) {
		daoUser.deleteById(id);
		
	}

	@Override
	public boolean existUsuario(Integer id) {
		return daoUser.existsById(id);
	}

}
