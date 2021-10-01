package com.tcsloja.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void testGetDescricao() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Produto produto = new Produto();
        final Field field = produto.getClass().getDeclaredField("descricao");
        field.setAccessible(true);
        field.set(produto, "Iphone");

        //when
        final String result = produto.getDescricao();

        //then
        assertEquals("Iphone", result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetDescricao() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Produto produto = new Produto();

        //when
        produto.setDescricao("Iphone");

        //then
        final Field field = produto.getClass().getDeclaredField("descricao");
        field.setAccessible(true);
        assertEquals("Iphone", field.get(produto), "Campos não batem!");
	}

	@Test
	void testGetCategoria() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Produto produto = new Produto();
        final Field field = produto.getClass().getDeclaredField("categoria");
        field.setAccessible(true);
        field.set(produto, "Celular");

        //when
        final String result = produto.getCategoria();

        //then
        assertEquals("Celular", result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetCategoria() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Produto produto = new Produto();

        //when
        produto.setCategoria("Celular");

        //then
        final Field field = produto.getClass().getDeclaredField("categoria");
        field.setAccessible(true);
        assertEquals("Celular", field.get(produto), "Campos não batem!");
	}

	@Test
	void testGetValorUnitario() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Produto produto = new Produto();
        final Field field = produto.getClass().getDeclaredField("valorUnitario");
        field.setAccessible(true);
        field.set(produto, new BigDecimal(100));

        //when
        final BigDecimal result = produto.getValorUnitario();

        //then
        assertEquals(new BigDecimal (100), result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetValorUnitario() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Produto produto = new Produto();

        //when
        produto.setValorUnitario(new BigDecimal(100));

        //then
        final Field field = produto.getClass().getDeclaredField("valorUnitario");
        field.setAccessible(true);
        assertEquals(new BigDecimal(100), field.get(produto), "Campos não batem!");
	}

}
