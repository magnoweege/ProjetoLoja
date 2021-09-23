package com.tcsloja.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcsloja.domain.Cliente;
import com.tcsloja.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesResources implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ClienteService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Cliente obj = service.buscar(id);

		return ResponseEntity.ok().body(obj);
	}

}
