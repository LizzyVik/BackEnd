package com.backendInventario.service;

import java.util.List;

import com.backendInventario.model.Sucursal;

public interface ISucursalService {

	public List<Sucursal> getAllSucursales();

	public Sucursal createSucursal(Sucursal sucursal);

	public Sucursal updateSucursal(Sucursal sucursal);

	public Sucursal getSucursales(Integer id);

	public void deleteSucursal(Integer id);

}
