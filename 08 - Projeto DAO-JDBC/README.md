## Classe de entidade departamento

###### Lista de controle:

- Attributes

- Constructors

- Getters/Setters

- hashCode and equals

- toString

- implements Serializable

#### Diagrama
![image](https://raw.githubusercontent.com/devjleonardo/assets/main/acesso-a-banco-de-dados-com-jdbc-java/06%20-%20Projeto%20DAO-JDBC/01%20-%20Classe%20Department/Diagrama.png)

## Classe de entidade vendedor

###### Lista de controle:

- Attributes

- Constructors

- Getters/Setters

- hashCode and equals

- toString

- implements Serializable

#### Diagrama
![image](https://raw.githubusercontent.com/devjleonardo/assets/main/acesso-a-banco-de-dados-com-jdbc-java/06%20-%20Projeto%20DAO-JDBC/02%20-%20Classe%20Seller/Diagrama.png)

## Implementando findById SellerDao

- SQL Query:
  - SELECT seller.*, department.Name as   DepName <br/>
    FROM seller INNER JOIN department <br/>
    ON seller.DepartmentId = department.Id <br>
    WHERE seller.Id = ?

#### ResultSet (table)
![image](https://raw.githubusercontent.com/devjleonardo/assets/main/acesso-a-banco-de-dados-com-jdbc-java/06%20-%20Projeto%20DAO-JDBC/03%20-%20Implementando%20findById%20SellerDao/ResultSet(table).png)