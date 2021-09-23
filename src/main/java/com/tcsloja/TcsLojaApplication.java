package com.tcsloja;

import java.math.BigDecimal;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tcsloja.domain.Cliente;
import com.tcsloja.domain.Produto;
import com.tcsloja.repositories.ClienteRepository;
import com.tcsloja.repositories.ProdutoRepository;

@SpringBootApplication
public class TcsLojaApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TcsLojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cli1 = new Cliente (null, "Marcos", 123456, "Rua", 123456, "bairro", "Taubate", "SP", 123456 );
		Cliente cli2 = new Cliente (null, "Rafael", 123456, "Avenida", 123456, "bairro", "Caçapava", "SP", 123456 );
		Cliente cli3 = new Cliente (null, "Carlos", 123456, "Estrada", 123456, "bairro", "Pinda", "SP", 123456 );
		
		Produto prod1 = new Produto (null, "Iphone11", "Celular", new BigDecimal(22));
		Produto prod2 = new Produto (null, "Iphone11", "Celular", new BigDecimal(10));
		Produto prod3 = new Produto (null, "Iphone11", "Celular", new BigDecimal(20));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
		produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		
	}
	
	

}
