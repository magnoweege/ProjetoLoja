package com.tcsloja.resources;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcsloja.domain.ItensDoPedido;
import com.tcsloja.services.ItensDoPedidoService;

@RestController
@RequestMapping(value = "/itensdopedidos")
public class ItensDoPedidoResource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ItensDoPedidoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		ItensDoPedido obj = service.find(id);

		return ResponseEntity.ok().body(obj);
	}

}
