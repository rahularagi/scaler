# Introduction to Spring Data JPA

## ORM

- ORM
- JPA
- Hibernate
- JDBC

### ORM

Object Relational Mapping (ORM) library:

- Hibernate
- MyBatis
- Joog

## JPA

Java Persistence API (JPA)

```
Interface<JPA> --> Hibernate --> JDBC
```

## Repository Pattern

- Code to interact with the persistence layer should be separate from business logic.
- Service --> Intermediate (Repository Layer) --> Database

## Example Entities

```java
@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;
}
```

```java
@Getter
@Setter
@Entity
public class Category extends BaseModel {
    @Id
    private Long id;
    private String name;
}
```

```java
@Getter
@Setter
@Entity
public class Product extends BaseModel {
    @Id
    private Long id;
    private String title;
    private double price;
    @ManyToOne
    private Category category;
    private String description;
    private String imageUrl;
}
```

## Query Handling

- **Declared Queries**
    - No need to write any SQL yourself
    - Just need to write a method name
    - ORM will create queries based on method names

- **HQL Queries**
  - HQL --> Hibernate query language
  - it comes in mid of SQL and Object oriented programming
  - loose coupling

- **Native Queries**
  - Need to use actual table name and column names
  - Tightly coupled

### CRUD Operations

- **C** - Create data
- **R** - Read data
- **U** - Update data
- **D** - Delete data




