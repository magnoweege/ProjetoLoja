package com.tcsloja.resources;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcsloja.domain.ItensDoPedido;
import com.tcsloja.services.ItensDoPedidoService;

@RestController
@RequestMapping(value = "/itensdopedidos")
public class ItensDoPedidoResource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ItensDoPedidoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ItensDoPedido>> findAll() {
		List<ItensDoPedido> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(value="/page", method = RequestMethod.GET)
	public ResponseEntity<Page<ItensDoPedido>> findPage(
			@RequestParam(value="page",defaultValue = "0") Integer page, 
			@RequestParam(value="linesPerPage",defaultValue = "24")Integer linesPerPage, 
			@RequestParam(value="orderBy",defaultValue = "codigoDoProduto")String orderBy, 
			@RequestParam(value="direction",defaultValue = "ASC")String direction) {
		Page<ItensDoPedido> list = service.findPage(page, linesPerPage, orderBy, direction);
		return ResponseEntity.ok().body(list);
	}

}
