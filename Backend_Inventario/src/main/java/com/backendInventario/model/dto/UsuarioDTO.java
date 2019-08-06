package com.backendInventario.model.dto;

import com.backendInventario.model.dto.CargoDTO;
import com.backendInventario.model.dto.SucursalDTO;
import com.backendInventario.model.dto.UsuarioDTO;

public class UsuarioDTO {
	private Integer id;
	private String rut;
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
//	private CargoDTO cargo;
//	private SucursalDTO sucursal;
//	private UsuarioDTO usuarioReg;
	
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public CargoDTO getCargo() {
//		return cargo;
//	}
//	public void setCargo(CargoDTO cargo) {
//		this.cargo = cargo;
//	}
//	public SucursalDTO getSucursal() {
//		return sucursal;
//	}
//	public void setSucursal(SucursalDTO sucursal) {
//		this.sucursal = sucursal;
//	}
//	public UsuarioDTO getUsuarioReg() {
//		return usuarioReg;
//	}
//	public void setUsuarioReg(UsuarioDTO usuarioReg) {
//		this.usuarioReg = usuarioReg;
//	}
}
