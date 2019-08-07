package com.backendInventario.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BoletaVenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numBoleta;
	private Date fechaCompra;
	private Integer montoNeto;
	private Integer montoIVADF;
	private Integer montoTotal;
	@ManyToOne
	private Usuario usuarioReg;
	public Integer getNumBoleta() {
		return numBoleta;
	}
	public void setNumBoleta(Integer numBoleta) {
		this.numBoleta = numBoleta;
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
	public Usuario getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(Usuario usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
}
