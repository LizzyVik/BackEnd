package com.backendInventario.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class FacturaCompra{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer numFactura;
	private Timestamp fechaCompra;
	private Integer montoNeto;
	private Integer montoIVACF;
	private Integer montoTotal;
	@ManyToOne
	private Sucursal sucursal;
	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "facturacompra",orphanRemoval = true)
	private List<FacturaCompraDet> lstDetalle= new ArrayList<>();
	@ManyToOne
	private Proveedor proveedor;
	@ManyToOne
	private Usuario usuarioReg;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(Integer numFactura) {
		this.numFactura = numFactura;
	}
	public Timestamp getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Timestamp fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Integer getMontoNeto() {
		return montoNeto;
	}
	public void setMontoNeto(Integer montoNeto) {
		this.montoNeto = montoNeto;
	}
	public Integer getMontoIVACF() {
		return montoIVACF;
	}
	public void setMontoIVACF(Integer montoIVACF) {
		this.montoIVACF = montoIVACF;
	}
	public Integer getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(Integer montoTotal) {
		this.montoTotal = montoTotal;
	}
	public List<FacturaCompraDet> getLstDetalle() {
		return lstDetalle;
	}
	public void setLstDetalle(List<FacturaCompraDet> lstDetalle) {
		this.lstDetalle = lstDetalle;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public Usuario getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(Usuario usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	
}
