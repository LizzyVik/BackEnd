package com.backendInventario.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movimiento {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer tipoMovimiento;
	private Integer numDocumento;
	@ManyToOne
	private Producto producto;
	private Integer cantidad;
	private Date fechaRegistro;
	@ManyToOne
	private Sucursal sucursal;
	@ManyToOne
	private Usuario usuario;
	private Integer precioCompra;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(Integer tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public Integer getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(Integer numDocumento) {
		this.numDocumento = numDocumento;
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
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Integer getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(Integer precioCompra) {
		this.precioCompra = precioCompra;
	}
}
