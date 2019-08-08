package com.backendInventario.model.dto;

public class ProveedorDTO {
	private Integer id;
	private String rut;
	private String razonSocial;
	private String direccion;
	private String comuna;
	private int telefono;
	private String rutRepresentanteLegal;
	private String nombreRepresentanteLegal;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getRutRepresentanteLegal() {
		return rutRepresentanteLegal;
	}
	public void setRutRepresentanteLegal(String rutRepresentanteLegal) {
		this.rutRepresentanteLegal = rutRepresentanteLegal;
	}
	public String getNombreRepresentanteLegal() {
		return nombreRepresentanteLegal;
	}
	public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
		this.nombreRepresentanteLegal = nombreRepresentanteLegal;
	}
}
