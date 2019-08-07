package com.backendInventario.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FacturaVenta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numFactura;
	private Date fechaCompra;
	private Integer montoNeto;
	private Integer montoIVADF;
	private Integer montoTotal;
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Usuario usuarioReg;
	
	public Integer getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(Integer numFactura) {
		this.numFactura = numFactura;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Integer getMontoNeto() {
		return montoNeto;
	}
	public void setMontoNeto(Integer montoNeto) {
		this.montoNeto = montoNeto;
	}
	public Integer getMontoIVADF() {
		return montoIVADF;
	}
	public void setMontoIVADF(Integer montoIVADF) {
		this.montoIVADF = montoIVADF;
	}
	public Integer getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(Integer montoTotal) {
		this.montoTotal = montoTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(Usuario usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
}
