package com.backendInventario.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BoletaVentaDet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer numBoletaVenta;
	@ManyToOne
	private Producto producto;
	private Integer cantidad;
	private Date fechaCompra;
	@ManyToOne
	private Usuario usuarioReg;
	
	
	public Integer getNumBoletaVenta() {
		return numBoletaVenta;
	}
	public void setNumBoletaVenta(Integer numBoletaVenta) {
		this.numBoletaVenta = numBoletaVenta;
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
	public Date getFecha() {
		return fechaCompra;
	}
	public void setFecha(Date fecha) {
		this.fechaCompra = fecha;
	}
	public Usuario getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(Usuario usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
	
	
}
