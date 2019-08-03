package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.Usuario;

public interface IUsuarioRepository  extends CrudRepository<Usuario, Integer>{

}
