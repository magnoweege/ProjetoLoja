package com.tcsloja.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcsloja.domain.Cliente;

@RestController
@RequestMapping(value="/clientes")
public class ClientesResources implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar() {

		Cliente cli1 = new Cliente(1, "Marcos Pontes", 111222, "Rua das casas", 11233456, "Bairrinho", "Cidade", "SP", 129991122 );
		Cliente cli2 = new Cliente(2, "Amanda Abril", 111222, "Rua das apes", 11233456, "Bairrinho", "Cidade", "RJ", 129991122 );
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(cli1);
		lista.add(cli2);
		
	 return lista;
	}

}
