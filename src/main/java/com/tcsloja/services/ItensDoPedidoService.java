package com.tcsloja.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.tcsloja.domain.ItensDoPedido;
import com.tcsloja.repositories.ItensDoPedidoRepository;

@Service
public class ItensDoPedidoService {

	@Autowired
	private ItensDoPedidoRepository repo;
	
	public List<ItensDoPedido> findAll(){
		return repo.findAll();
	}
	
	public Page<ItensDoPedido> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);	
	}

}
