package com.tcsloja.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcsloja.domain.Pedido;
import com.tcsloja.domain.Produto;
import com.tcsloja.repositories.PedidoRepository;
import com.tcsloja.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
	@Transactional
	public Pedido insert (Pedido obj) {
		obj.setNumeroDoPedido(null);
		return repo.save(obj);
	}
	
	public Pedido update(Pedido obj) {
		find (obj.getNumeroDoPedido());
		return repo.save(obj);
	}
	public void delete (Integer id) {
		find(id);
		repo.deleteById(id);
	}

}
