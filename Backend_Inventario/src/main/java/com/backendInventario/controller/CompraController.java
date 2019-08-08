package com.backendInventario.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backendInventario.Enum.ETipoMovimiento;
import com.backendInventario.model.FacturaCompra;
import com.backendInventario.model.FacturaCompraDet;
import com.backendInventario.model.Movimiento;
import com.backendInventario.model.Producto;
import com.backendInventario.model.Sucursal;
import com.backendInventario.model.dto.FacturaCompraDTO;
import com.backendInventario.model.dto.FacturaCompraDetDTO;
import com.backendInventario.service.IFacturaCompraService;

@CrossOrigin(origins="http://localhost:4200")
@Controller("/compra")
public class CompraController {
	
	@Autowired
	private IFacturaCompraService facturacompraservice;

	ModelMapper modelMapper = new ModelMapper();
	
	@PostMapping(value = "compra/add")
	public ResponseEntity<?> ingresarCompra(@RequestBody FacturaCompraDTO facturacompradto) {
		java.util.Date fechaActual = new java.util.Date();
		facturacompradto.setFechaCompra(new Timestamp(fechaActual.getTime()));
		for (FacturaCompraDetDTO f:facturacompradto.getLstDetalle()){
			f.setFechaCompra(new Timestamp(fechaActual.getTime()));
		}
		FacturaCompraDTO response = modelMapper.map(facturacompraservice.crearFacturaCompra(modelMapper.map(facturacompradto,FacturaCompra.class)),FacturaCompraDTO.class);
//		List<Movimiento> lstRequest =this.guardarInventarioCompra(response);
//		if (lstRequest.isEmpty()) {
//			return new  ResponseEntity<String>("Error al ingresar inventario",HttpStatus.UNPROCESSABLE_ENTITY);
//		}
//		if (lstRequest.size()!=response.getLstDetalle().size()) {
//			return new  ResponseEntity<String>("Error  de descuadre",HttpStatus.UNPROCESSABLE_ENTITY);
//		}
		return new  ResponseEntity<FacturaCompraDTO>(response,HttpStatus.OK);
	}
//	@SuppressWarnings("unused")
//	private List<Movimiento> guardarInventarioCompra(FacturaCompraDTO facturacompradto) {
//		List<Movimiento> lstRequest =new ArrayList<Movimiento>();
//		for (FacturaCompraDetDTO f:facturacompradto.getLstDetalle()){
//			Movimiento inventario = new Movimiento();
//			//Cabecera
//			inventario.setSucursal(modelMapper.map(facturacompradto.getSucursal(),Sucursal.class));
//			inventario.setFechaRegistro(facturacompradto.getFechaCompra());
//			inventario.setTipoMovimiento(ETipoMovimiento.Compra.getCodTipoVenta());
//			inventario.setNumTransaccion("FactComp-id"+facturacompradto.getId()+"-numDoc"+facturacompradto.getNumFactura());
//			//Detalle
//			inventario.setProducto(modelMapper.map(f.getProducto(),Producto.class));
//			inventario.setCantidad(f.getCantidad());
//			inventario.setPrecioCompra(f.getPrecioCompraUnitario());
//			lstRequest.add(inventario);
//		}
//		return lstRequest;
//	}
}
