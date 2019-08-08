package com.backendInventario.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FacturaCompraDet{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	@ManyToOne(fetch = FetchType.LAZY)
	private FacturaCompra facturacompra;
	@ManyToOne
	private Producto producto;
	private Integer cantidad;
	private Integer precioCompraUnitario;
	private Timestamp fechaCompra;
	@ManyToOne
	private Usuario usuarioReg;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getPrecio() {
		return this.precioCompraUnitario;
	}
	public void setPrecio(Integer precio) {
		this.precioCompraUnitario = precio;
	}
	public Timestamp getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Timestamp fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Usuario getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(Usuario usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
	public FacturaCompra getFacturacompra() {
		return facturacompra;
	}
	public void setFacturacompra(FacturaCompra facturacompra) {
		this.facturacompra = facturacompra;
	}
	public Integer getPrecioCompraUnitario() {
		return precioCompraUnitario;
	}
	public void setPrecioCompraUnitario(Integer precioCompraUnitario) {
		this.precioCompraUnitario = precioCompraUnitario;
	}
}
