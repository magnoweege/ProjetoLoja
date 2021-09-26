package com.tcsloja;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tcsloja.domain.Cliente;
import com.tcsloja.domain.Pedido;
import com.tcsloja.domain.Produto;
import com.tcsloja.repositories.ClienteRepository;
import com.tcsloja.repositories.PedidoRepository;
import com.tcsloja.repositories.ProdutoRepository;

@SpringBootApplication
public class TcsLojaApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TcsLojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cli1 = new Cliente (null, "Marcos", 123456, "Rua", 123456, "bairro", "Taubate", "SP", 123456 );
		Cliente cli2 = new Cliente (null, "Rafael", 123456, "Avenida", 123456, "bairro", "Caçapava", "SP", 123456 );
		Cliente cli3 = new Cliente (null, "Carlos", 123456, "Estrada", 123456, "bairro", "Pinda", "SP", 123456 );
		Cliente cli4 = new Cliente (null, "Marcelo", 123456, "Estrada", 123456, "bairro", "Pinda", "SP", 123456 );
		Cliente cli5 = new Cliente (null, "Luiz", 123456, "Estrada", 123456, "bairro", "Vale", "SP", 123456 );
		Cliente cli6 = new Cliente (null, "Regis", 123456, "Estrada", 123456, "bairro", "Poa", "SP", 123456 );
		Cliente cli7 = new Cliente (null, "Maira", 123456, "Estrada", 123456, "bairro", "Pinda", "SP", 123456 );
		
		Produto prod1 = new Produto (null, "Iphone11", "Celular", new BigDecimal(22));
		Produto prod2 = new Produto (null, "Iphone11", "Celular", new BigDecimal(10));
		Produto prod3 = new Produto (null, "Iphone11", "Celular", new BigDecimal(20));
		
		Pedido ped1 = new Pedido(null, 1, new Date(10102000), new BigDecimal(200), "celular calça", new BigDecimal(20), cli1);
		Pedido ped2 = new Pedido(null, 2, new Date(10112000), new BigDecimal(100), "celular tenis", new BigDecimal(30), cli1);
		Pedido ped3 = new Pedido(null, 3, new Date(11102000), new BigDecimal(80), "celular tenis", new BigDecimal(10), cli2);

		
		
		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		
		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		cli2.getPedidos().addAll(Arrays.asList(ped3));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7));
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2, ped3));
		
	}
	
	

}
