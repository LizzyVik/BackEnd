package com.backendInventario.repository;

import org.springframework.data.repository.CrudRepository;
import com.backendInventario.model.FacturaCompraDet;

public interface IFacturaCompraDetRepository extends CrudRepository<FacturaCompraDet, Integer> {

}
