package com.backendInventario.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String modelo;
	@OneToOne
	private Marca marca;
	private String color;
	@OneToOne
	private Categoria categoria;
	private Integer precio;
	private Integer cantidadMax;
	private Integer cantidadMin;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Integer getCantidadMax() {
		return cantidadMax;
	}
	public void setCantidadMax(Integer cantidadMax) {
		this.cantidadMax = cantidadMax;
	}
	public Integer getCantidadMin() {
		return cantidadMin;
	}
	public void setCantidadMin(Integer cantidadMin) {
		this.cantidadMin = cantidadMin;
	}
}