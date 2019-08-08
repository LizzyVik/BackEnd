package com.backendInventario.model.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class FacturaCompraDetDTO{
	private Integer Id;
	private ProductoDTO producto;
	private Integer cantidad;
	private Integer precioCompraUnitario;
	private Timestamp fechaCompra;
	private UsuarioDTO usuarioReg;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public Integer getPrecioCompraUnitario() {
		return precioCompraUnitario;
	}
	public void setPrecioCompraUnitario(Integer precioCompraUnitario) {
		this.precioCompraUnitario = precioCompraUnitario;
	}
	public Timestamp getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Timestamp fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public UsuarioDTO getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(UsuarioDTO usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
}
