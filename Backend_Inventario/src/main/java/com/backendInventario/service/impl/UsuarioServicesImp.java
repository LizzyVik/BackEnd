package com.backendInventario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.Usuario;
import com.backendInventario.repository.IUsuarioRepository;
import com.backendInventario.service.IUsuarioService;
@Service
public class UsuarioServicesImp implements IUsuarioService {

	@Autowired 
	private IUsuarioRepository usuariorepository;
	
	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuariorepository.findAll();
	}

	@Override
	public Usuario findbyId(int id) {
		return usuariorepository.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario user) {
		return usuariorepository.save(user);
	}

	@Override
	public void delete(int id) {
		usuariorepository.deleteById(id);
		
	}

	@Override
	public boolean existUsuario(Integer id) {
		return usuariorepository.existsById(id);
	}
	
	@Override
	public Integer existUserByEmailAndPassword(Usuario usuario) {
		return usuariorepository.existUserByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
	}
	@Override
	public Usuario findUserByEmailAndPassword(Usuario usuario) {
		return usuariorepository.findUserByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
	}
}
