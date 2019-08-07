package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;

import com.backendInventario.model.Cliente;

public interface IClienteRespository extends CrudRepository<Cliente, Integer>  {

}
