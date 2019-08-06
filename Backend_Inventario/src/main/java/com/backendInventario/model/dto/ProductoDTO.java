package com.backendInventario.model.dto;

public class ProductoDTO {
	
	private Integer id;
	private String modelo;
	private MarcaDTO marca;
	private String color;
	private CategoriaDTO categoria;
	private Integer precioVenta;
	private Integer cantidadMax;
	private Integer cantidadMin;
	private UsuarioDTO usuarioReg;
	
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
	public MarcaDTO getMarca() {
		return marca;
	}
	public void setMarca(MarcaDTO marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public CategoriaDTO getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}
	public Integer getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Integer precioVenta) {
		this.precioVenta = precioVenta;
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
	public UsuarioDTO getUsuarioReg() {
		return usuarioReg;
	}
	public void setUsuarioReg(UsuarioDTO usuarioReg) {
		this.usuarioReg = usuarioReg;
	}
}
