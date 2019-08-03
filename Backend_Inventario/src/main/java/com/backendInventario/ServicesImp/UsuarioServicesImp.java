package com.backendInventario.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.backendInventario.DAO.UsuarioDao;
import com.backendInventario.ModelEntity.Usuario;
import com.backendInventario.Services.UsuarioService;
@Service
public class UsuarioServicesImp implements UsuarioService {

	@Autowired 
	private UsuarioDao daoUser;
	
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
