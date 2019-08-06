package com.backendInventario.model.dto;

import java.sql.Date;


public class MovimientoDTO {
	
	private Integer id;
	private Date fechaRegistro;
	private Integer tipoMovimiento;
	private String numTransaccion;
	private ProductoDTO producto;
	private Integer cantidad;
	private SucursalDTO sucursal;
	private UsuarioDTO usuarioReg;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Integer getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(Integer tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public String getNumTransaccion() {
		return numTransaccion;
	}
	public void setNumTransaccion(String numTransaccion) {
		this.numTransaccion = numTransaccion;
	}
	public ProductoDTO getProducto() {
		return producto;
	}
	public void setProducto(ProductoDTO producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public SucursalDTO getSucursal() {
		return sucursal;
	}
	public void setSucursal(SucursalDTO sucursal) {
		this.sucursal = sucursal;
	}
	public UsuarioDTO getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(UsuarioDTO usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
}
