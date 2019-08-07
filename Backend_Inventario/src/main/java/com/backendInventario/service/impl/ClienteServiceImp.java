package com.backendInventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendInventario.model.Cliente;
import com.backendInventario.repository.IClienteRespository;
import com.backendInventario.service.IClienteService;

@Service
public class ClienteServiceImp implements IClienteService{

	@Autowired
	private IClienteRespository clienterepository;
	
	public Cliente crearCliente(Cliente cliente) {
		return clienterepository.save(cliente);
	}
}
