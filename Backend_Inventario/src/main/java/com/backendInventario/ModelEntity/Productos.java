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
public class Productos {

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
private Integer id;
@Column
private String modelo;
@OneToOne
private Marcas marca;
@Column
private String color;
@OneToOne
private  Categorias categoría;
@Column
private Long precioVenta;
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


public Marcas getMarca() {
	return marca;
}


public void setMarca(Marcas marca) {
	this.marca = marca;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public Categorias getCategoría() {
	return categoría;
}


public void setCategoría(Categorias categoría) {
	this.categoría = categoría;
}


public Long getPrecioVenta() {
	return precioVenta;
}


public void setPrecioVenta(Long precioVenta) {
	this.precioVenta = precioVenta;
}


public Stock getStock() {
	return stock;
}


public void setStock(Stock stock) {
	this.stock = stock;
}


}
