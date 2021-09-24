package com.tcsloja.resources;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcsloja.domain.Produto;
import com.tcsloja.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ProdutoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Produto obj = service.find(id);

		return ResponseEntity.ok().body(obj);
	}

}
