# # Aplicativo REST API LOJA (Cliente, Produto, Pedido, Itens do Pedido)
## Requerimentos

Para construir e executar a aplicação você precisa:
- [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11-windows)
- [Maven 3](https://maven.apache.org)

## Executando a aplicação localmente:

Há vários jeitos de execuatr uma aplicação Spring Boot localmente na sua máquina. Um dos modos é executar o método `main` na classe `TcsLojaApplication` na sua IDE.

Caso tenha instalado o [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) é só digitar:

```shell
mvn spring-boot:run
```

Após executar o comando acima, acesse o navegador nos endereços:

### Clientes

Listar todos clientes pré carregados:
```shell
http://localhost:8080/api/v1/clientes/
```
Mostrar um cliente em específico:
```shell
http://localhost:8080/api/v1/clientes/1
```
Mostrar todos clientes com paginação:
```shell
http://localhost:8080/api/v1/clientes/page
```

### Produtos

Listar todos produtos pré carregados:
```shell
http://localhost:8080/api/v1/produtos/
```
Mostrar um produto em específico:
```shell
http://localhost:8080/api/v1/produtos/1
```
Mostrar todos produtos com paginação:
```shell
http://localhost:8080/api/v1/produtos/page
```

### Pedidos

Listar todos pedidos pré carregados:
```shell
http://localhost:8080/api/v1/pedidos/
```
Mostrar um pedido em específico:
```shell
http://localhost:8080/api/v1/pedidos/1
```
Mostrar todos pedidos com paginação:
```shell
http://localhost:8080/api/v1/pedidos/page
```

### Itens de pedidos

Listar todos os itens de pedidos:
```shell
http://localhost:8080/api/v1/itensdopedidos
```
Mostrar todos pedidos com paginação:
```shell
http://localhost:8080/api/v1/itensdopedidos/page
```

### Swagger UI
Para acessar o CRUD completo das classes utilizando as especificações REST, utilize o swagger conforme abaixo:

```shell
http://localhost:8080/api/v1/swagger-ui.html
```

### H2 banco de dados em memória
Para acessar o banco de dados acesse a página:

```shell
http://localhost:8080/api/v1/h2-console/
```

* jdbc:h2:mem:loja<br>
* username=sa<br>
* password=<br>

### LOG4J Logs criados em arquivo no diretório do Tomcat conforme abaixo:
```shell
${catalina.home}/logs/loja.log
```
### JUnit Criado testes utilizando reflecção para 2 classes
```shell
ClienteTest e ProdutoTest
```

### Bibliotecas utilizadas:
 - spring-boot-starter-web
- spring-boot-starter-data-jpa
- spring-data-jpa
- hibernate-entitymanager
- com.h2database
- hibernate-core
- spring-boot-starter-test
- validation-api
- log4j
- org.junit.jupiter
- springfox-swagger2
- springfox-swagger-ui
- spring-boot-maven-plugin
