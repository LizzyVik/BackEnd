package com.backendInventario.DAO;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.ModelEntity.Usuario;

public interface UsuarioDao  extends CrudRepository<Usuario, Integer>{

}
