package com.backendInventario.service;

import java.util.List;

import com.backendInventario.model.Usuario;;

    public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findbyId (int id);
	
    public Usuario save(Usuario user);
	
	public void delete(int id);

	public boolean existUsuario(Integer id);

	public boolean existUserByEmailAndPassword(Usuario usuario);

	public Usuario findUserByEmailAndPassword(Usuario usuario);

}
