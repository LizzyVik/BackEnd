package com.backendInventario.Enum;

public enum ETipoMovimiento {
	Venta(1), //Descuento Inventario
	Compra(2), //Aumento Inventario
	NotaCredito(3), //Descuento de inventario
	NotaDebito(4); //Aumento de inventario
	
	private final Integer codTipoVenta;
	private ETipoMovimiento(Integer codTipoVenta) {
		this.codTipoVenta= codTipoVenta;
	}
	public  Integer getCodTipoVenta() {
		return this.codTipoVenta;
	}
}
