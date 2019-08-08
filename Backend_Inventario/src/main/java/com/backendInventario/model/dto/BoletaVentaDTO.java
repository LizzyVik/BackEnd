package com.backendInventario.model.dto;

import java.sql.Date;
import java.util.List;

public class BoletaVentaDTO {
	
	private Integer numBoleta;
	private Date fechaCompra;
	private Integer montoNeto;
	private Integer montoIVADF;
	private Integer montoTotal;
	private List<BoletaVentaDetDTO> lstDetalle;
	private UsuarioDTO usuarioReg;
	
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
	public List<BoletaVentaDetDTO> getLstDetalle() {
		return lstDetalle;
	}
	public void setLstDetalle(List<BoletaVentaDetDTO> lstDetalle) {
		this.lstDetalle = lstDetalle;
	}
	public UsuarioDTO getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(UsuarioDTO usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
}
