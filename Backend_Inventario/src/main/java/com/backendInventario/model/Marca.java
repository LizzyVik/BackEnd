package com.backendInventario.model;


import javax.persistence.*;

@Entity
public class Marca {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true)
	private String nombreMarca;
	//@ManyToOne
	//private Usuario usuarioReg;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	//public Usuario getUsuarioReg() {
		//return usuarioReg;
	//}
	//public void setUsuarioReg(Usuario usuarioReg) {
		//this.usuarioReg = usuarioReg;
	//}
}

