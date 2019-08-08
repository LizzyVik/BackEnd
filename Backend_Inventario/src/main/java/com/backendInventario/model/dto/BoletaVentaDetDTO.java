package com.backendInventario.model.dto;

import java.sql.Date;

public class BoletaVentaDetDTO {
	
	private Integer numBoletaVenta;
	private ProductoDTO producto;
	private Integer cantidad;
	private Date fechaCompra;
	private UsuarioDTO usuarioReg;
	
	
	public Integer getNumBoletaVenta() {
		return numBoletaVenta;
	}
	public void setNumBoletaVenta(Integer numBoletaVenta) {
		this.numBoletaVenta = numBoletaVenta;
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
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public UsuarioDTO getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(UsuarioDTO usuarioReg) {
		this.usuarioReg = usuarioReg;
	}

}
