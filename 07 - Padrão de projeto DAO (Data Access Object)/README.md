## Padrão de projeto DAO (Data Access Object)

###### Lista de controle:

- Referências: 
  - https://www.devmedia.com.br/dao-pattern-persistencia-de-dados-utilizando-o-padrao-dao/30999

  - https://www.oracle.com/technetwork/java/dataaccessobject-138824.html

- Ideia geral do padrão DAO:

  - Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta
  entidade. Por exemplo:
    
    - Cliente: ClienteDao

    - Produto: ProdutoDao

    - Pedido: PedidoDao

  - Cada DAO será definido por uma interface.

  - A injeção de dependência pode ser feita por meio do padrão de projeto Factory

#### Diagrama de exmplo
![image](https://raw.githubusercontent.com/devjleonardo/assets/main/acesso-a-banco-de-dados-com-jdbc-java/05%20-%20Padr%C3%A3o%20de%20projeto%20DAO%20(Data%20Access%20Object)/Diagrama.png)