package com.tcsloja.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testGetNomeCompleto() throws NoSuchFieldException, IllegalAccessException{
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("nomeCompleto");
        field.setAccessible(true);
        field.set(cliente, "Marcos");

        //when
        final String result = cliente.getNomeCompleto();

        //then
        assertEquals("Marcos", result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetNomeCompleto() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setNomeCompleto("Marcos");

        //then
        final Field field = cliente.getClass().getDeclaredField("nomeCompleto");
        field.setAccessible(true);
        assertEquals("Marcos", field.get(cliente), "Campos não batem!");
	}

	@Test
	void testGetCpf() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("cpf");
        field.setAccessible(true);
        field.set(cliente, 3335520);

        //when
        final Integer result = cliente.getCpf();

        //then
        assertEquals(3335520, result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetCpf() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setCpf(3335520);

        //then
        final Field field = cliente.getClass().getDeclaredField("cpf");
        field.setAccessible(true);
        assertEquals(3335520, field.get(cliente), "Campos não batem!");
	}

	@Test
	void testGetEndereco() throws NoSuchFieldException, IllegalAccessException{
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("endereco");
        field.setAccessible(true);
        field.set(cliente, "Rua sete");

        //when
        final String result = cliente.getEndereco();

        //then
        assertEquals("Rua sete", result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetEndereco() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setEndereco("Rua sete");

        //then
        final Field field = cliente.getClass().getDeclaredField("endereco");
        field.setAccessible(true);
        assertEquals("Rua sete", field.get(cliente), "Campos não batem!");
	}

	@Test
	void testGetCep() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("cep");
        field.setAccessible(true);
        field.set(cliente, 12020111);

        //when
        final Integer result = cliente.getCep();

        //then
        assertEquals(12020111, result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetCep() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setCep(123456);

        //then
        final Field field = cliente.getClass().getDeclaredField("cep");
        field.setAccessible(true);
        assertEquals(123456, field.get(cliente), "Campos não batem!");
	}

	@Test
	void testGetBairro() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("bairro");
        field.setAccessible(true);
        field.set(cliente, "Vila Nova");

        //when
        final String result = cliente.getBairro();

        //then
        assertEquals("Vila Nova", result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetBairro() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setBairro("Vila Nova");

        //then
        final Field field = cliente.getClass().getDeclaredField("bairro");
        field.setAccessible(true);
        assertEquals("Vila Nova", field.get(cliente), "Campos não batem!");
	}

	@Test
	void testGetCidade() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("cidade");
        field.setAccessible(true);
        field.set(cliente, "SpringField");

        //when
        final String result = cliente.getCidade();

        //then
        assertEquals("SpringField", result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetCidade() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setCidade("SpringField");

        //then
        final Field field = cliente.getClass().getDeclaredField("cidade");
        field.setAccessible(true);
        assertEquals("SpringField", field.get(cliente), "Campos não batem!");
	}

	@Test
	void testGetUf() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("uf");
        field.setAccessible(true);
        field.set(cliente, "SP");

        //when
        final String result = cliente.getUf();

        //then
        assertEquals("SP", result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetUf() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setUf("SP");

        //then
        final Field field = cliente.getClass().getDeclaredField("uf");
        field.setAccessible(true);
        assertEquals("SP", field.get(cliente), "Campos não batem!");
	}

	@Test
	void testGetTelefone() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();
        final Field field = cliente.getClass().getDeclaredField("telefone");
        field.setAccessible(true);
        field.set(cliente, 36225544);

        //when
        final Integer result = cliente.getTelefone();

        //then
        assertEquals(36225544, result, "O Campo retornado não está correto!");
	}

	@Test
	void testSetTelefone() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Cliente cliente = new Cliente();

        //when
        cliente.setTelefone(36225544);

        //then
        final Field field = cliente.getClass().getDeclaredField("telefone");
        field.setAccessible(true);
        assertEquals(36225544, field.get(cliente), "Campos não batem!");
	}

}
