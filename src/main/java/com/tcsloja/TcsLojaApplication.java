package com.tcsloja;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tcsloja.domain.Cliente;
import com.tcsloja.domain.ItensDoPedido;
import com.tcsloja.domain.Pedido;
import com.tcsloja.domain.Produto;
import com.tcsloja.repositories.ClienteRepository;
import com.tcsloja.repositories.ItensDoPedidoRepository;
import com.tcsloja.repositories.PedidoRepository;
import com.tcsloja.repositories.ProdutoRepository;
import com.tcsloja.utility.CalculoDoFrete;

@SpringBootApplication
public class TcsLojaApplication implements CommandLineRunner{
	
    static Logger logger = Logger.getLogger(TcsLojaApplication.class);  
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ItensDoPedidoRepository itensDoPedidoRepository;
	
	
	public static void main(String[] args) {
		 
		SpringApplication.run(TcsLojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.setLevel(Level.ALL);
		DOMConfigurator.configure("src/main/resources/log4j.xml");  
        logger.debug("Iniciando a aplicação"); 
		
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
		
		//Entre com o CEP para verificar se o mesmo está entre o range e retornar um bigdecimal com o valor do frete
		//Poderia ser feito criando uma Entity e criando uma tabela na memória.
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.getDefault());
		BigDecimal valorFrete = CalculoDoFrete.numEntre(57100000);
		String s = n.format(valorFrete);
		 System.out.println("Valor do frete dado um CEP no formato ########: R"+s);
		
		 ItensDoPedido ip1 = new ItensDoPedido(ped1, prod1, 0001, new BigDecimal(100), 1);
		 ItensDoPedido ip2 = new ItensDoPedido(ped1, prod3, 0003, new BigDecimal(80), 2);
		 ItensDoPedido ip3 = new ItensDoPedido(ped2, prod2, 0003, new BigDecimal(50), 1);
		 
		 ped1.getItens().addAll(Arrays.asList(ip1,ip2));
		 ped2.getItens().addAll(Arrays.asList(ip3));
		 
		 prod1.getItens().addAll(Arrays.asList(ip1));
		 prod2.getItens().addAll(Arrays.asList(ip3));
		 prod3.getItens().addAll(Arrays.asList(ip2));
		 
		 itensDoPedidoRepository.saveAll(Arrays.asList(ip1,ip2,ip3));
		 
	}
	
	

}
