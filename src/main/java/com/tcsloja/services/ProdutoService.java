package com.tcsloja.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcsloja.domain.Produto;
import com.tcsloja.repositories.ProdutoRepository;
import com.tcsloja.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()));
	}
	
	@Transactional
	public Produto insert (Produto obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Produto update(Produto obj) {
		find (obj.getId());
		return repo.save(obj);
	}
	public void delete (Integer id) {
		find(id);
		repo.deleteById(id);
	}

}
