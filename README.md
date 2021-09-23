# Aplicativo REST API LOJA (Cliente, Produto, Pedido, Itens do Pedido)
 <b>Utilizado o STS (Spring Tool Suite)</b><br>
  1- Realizado a criação de 2 endpoints (Cliente e Produto)
  * Acesso via Postman localhost:8080/tcs/clientes/1   (trocando o {id})
  * Acesso via Postman localhost:8080/tcs/produtos/1   (trocando o {id})<br>
  2- Criado o banco em  H2 em memória.
  * Acesso pelo http://localhost:8080/h2-console/   
  * Usuario: sa Senha ""
  * jdbc:h2:mem:loja<br>
  3- Criação de 3 objetos automaticos para Cliente e Produto, ao executar o aplicativo.<br>
  4- Estrutura criada com camadas:<br>
  Application -> Controllers REST -> Service - > Repository / Domains<br>
  5- (Falta) Criaçao e listagem de pedidos e itens do pedido<br>
  6- Nota fiscal com dados do cliente (Nome, CPF e CEP), número do pedido, itens do pedido (nome do produto, valor unitário, valor total, quantidade de cada item) e o frete (UF, Nome do estado, valor do frete).<br>
  7- Cálculo de frete (com tabela dada)<br>
  8- (Falta) Criar testes unitários<br>
  9- (Falta) Configurar Log4J<br>
  10- (Falta) Criar série de testes para postman_collection.json<br>
  11- (Falta) Criar um arquivo swagger(Open API) para documentar a API<br>
  
  <h2> ###### 23/09/2021 Incluido: #######<h2>
  - Alterado context /tcs<br>
  - Incluido arquivos swagger<br>
  
