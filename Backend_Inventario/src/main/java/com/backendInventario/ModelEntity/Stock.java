package com.backendInventario.ModelEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Stock {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private int cantidadActual;
	@Column
	private int cantidadMax;
	@Column
	private int cantidadMin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	public int getCantidadMax() {
		return cantidadMax;
	}
	public void setCantidadMax(int cantidadMax) {
		this.cantidadMax = cantidadMax;
	}
	public int getCantidadMin() {
		return cantidadMin;
	}
	public void setCantidadMin(int cantidadMin) {
		this.cantidadMin = cantidadMin;
	}

	
	
	
}
