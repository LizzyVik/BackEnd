package com.backendInventario.Services;

import java.util.List;

import com.backendInventario.ModelEntity.Usuario;;

    public interface UsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findbyId (int id);
	
    public Usuario save(Usuario user);
	
	public void delete(int id);

	public boolean existUsuario(Integer id);

}
