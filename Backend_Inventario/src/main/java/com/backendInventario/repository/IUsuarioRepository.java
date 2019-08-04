package com.backendInventario.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.backendInventario.model.Usuario;

public interface IUsuarioRepository  extends CrudRepository<Usuario, Integer>{
	@Query(value = "SELECT CASE WHEN count(u.id)=0 THEN FALSE ELSE TRUE END AS EXIST FROM pgp_ds.Usuario  AS u WHERE u.email=:email AND u.password=:password",nativeQuery = true)
	public boolean existUserByEmailAndPassword(@Param("email") String email,@Param("password") String password);
	
	@Query(value = "SELECT u FROM Usuario AS u WHERE u.email=:email AND u.password=:password",nativeQuery = true)
	public Usuario findUserByEmailAndPassword(@Param("email") String email,@Param("password") String password);
}
