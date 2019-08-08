package com.backendInventario.model.dto;

import java.sql.Timestamp;
import java.util.List;

public class FacturaCompraDTO{
	private Integer id;
	private Integer numFactura;
	private Timestamp fechaCompra;
	private Integer montoNeto;
	private Integer montoIVACF;
	private Integer montoTotal;
	private List<FacturaCompraDetDTO> lstDetalle;
	private ProveedorDTO proveedor;
	private SucursalDTO sucursal;
	private UsuarioDTO usuarioReg;
	
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
	public List<FacturaCompraDetDTO> getLstDetalle() {
		return lstDetalle;
	}
	public void setLstDetalle(List<FacturaCompraDetDTO> lstDetalle) {
		this.lstDetalle = lstDetalle;
	}
	public ProveedorDTO getProveedor() {
		return proveedor;
	}
	public void setProveedor(ProveedorDTO proveedor) {
		this.proveedor = proveedor;
	}
	public UsuarioDTO getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(UsuarioDTO usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
	public SucursalDTO getSucursal() {
		return sucursal;
	}
	public void setSucursal(SucursalDTO sucursal) {
		this.sucursal = sucursal;
	}
	
}
