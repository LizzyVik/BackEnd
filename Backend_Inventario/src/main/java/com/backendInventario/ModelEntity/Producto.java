package com.backendInventario.ModelEntity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
private Integer id;
@Column
private String modelo;
@OneToOne
private Marca marca;
@Column
private String color;
@OneToOne
private  Categoria categoría;
@Column
private Integer precio;
@OneToOne
private Stock stock;

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
public Categoria getCategoría() {
	return categoría;
}
public void setCategoría(Categoria categoría) {
	this.categoría = categoría;
}
public Integer getPrecio() {
	return precio;
}
public void setPrecio(Integer precio) {
	this.precio = precio;
}
public Stock getStock() {
	return stock;
}
public void setStock(Stock stock) {
	this.stock = stock;
}
	

}
