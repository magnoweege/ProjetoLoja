package com.tcsloja.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcsloja.domain.ItensDoPedido;
import com.tcsloja.repositories.ItensDoPedidoRepository;
import com.tcsloja.services.exceptions.ObjectNotFoundException;

@Service
public class ItensDoPedidoService {

	@Autowired
	private ItensDoPedidoRepository repo;

	public ItensDoPedido find(Integer id) {
		Optional<ItensDoPedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + ItensDoPedido.class.getName()));
	}

}
