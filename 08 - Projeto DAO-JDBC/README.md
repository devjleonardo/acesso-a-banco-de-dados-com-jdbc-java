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
  - SELECT seller.*, department.Name as DepName <br/>
    FROM seller <br/>
    INNER JOIN department ON seller.DepartmentId = department.Id <br/>
    WHERE seller.Id = ?

#### ResultSet (table)
![image](https://raw.githubusercontent.com/devjleonardo/assets/main/acesso-a-banco-de-dados-com-jdbc-java/06%20-%20Projeto%20DAO-JDBC/03%20-%20Implementando%20findById%20SellerDao/ResultSet(table).png)

## Reutilizando a instanciação findById SellerDao

```bash
private Seller instantiateSeller(ResultSet resultSet, Department department) throws SQLException {
        Seller seller = new Seller();
	seller.setId(resultSet.getInt("Id"));
	seller.setName(resultSet.getString("Name"));
	seller.setEmail(resultSet.getString("Email"));
	seller.setBirthDate(resultSet.getDate("BirthDate"));
        seller.setBaseSalary(resultSet.getDouble("BaseSalary"));
	seller.setDepartment(department);
	return seller;
}

private Department instantiateDepartment(ResultSet resultSet) throws SQLException {
    Department department = new Department();
    department.setId(resultSet.getInt("DepartmentId"));
    department.setName(resultSet.getString("DepName"));
    return department;
}
```
## Implementando findByDepartment SellerDao

- SQL Query:
  - SELECT seller.*,department.Name as DepName <br/>
    FROM seller <br/>
    INNER JOIN department ON seller.DepartmentId = department.Id <br/>
    WHERE DepartmentId = ? <br/>
    ORDER BY Name

#### Diagramas
![image](https://raw.githubusercontent.com/devjleonardo/assets/main/acesso-a-banco-de-dados-com-jdbc-java/06%20-%20Projeto%20DAO-JDBC/04%20-%20Implementando%20findByDepartment%20SellerDao/Diagrama.png)
