package com.backendInventario.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movimiento {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Timestamp fechaRegistro;
	private Integer tipoMovimiento;
	private String numTransaccion;
	@ManyToOne
	private Producto producto;
	private Integer precioCompra;
	private Integer precioVenta;
	private Integer cantidad;
	@ManyToOne
	private Sucursal sucursal;
	@ManyToOne
	private Usuario usuarioReg;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Timestamp getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Timestamp fechaRegistro) {
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
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public Usuario getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(Usuario usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
	public Integer getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(Integer precioCompra) {
		this.precioCompra = precioCompra;
	}
	public Integer getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Integer precioVenta) {
		this.precioVenta = precioVenta;
	}

}
