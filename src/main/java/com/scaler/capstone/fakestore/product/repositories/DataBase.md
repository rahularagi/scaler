Introduction to spring data JPA
--
* ORM
* JPA
* Hibernate
* Jdbc

* ORM
Object Relational mapping
 ORM library 
* Hibernate
* MyBatis
* Joog


JPA -> Java persistence API

Interface<JPA> --> Hibernate to--> JDBC


Repository pattern
  * Code to interact with persistence layer should separate from business logic
  * service --> intermediate(Repository layer) --> Database

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


@Getter
@Setter
@Entity
public class Category extends BaseModel{
@Id
private Long id;
private String name;
}

@Getter
@Setter
@Entity
public class Product extends BaseModel{
@Id
private Long id;
private String title;
private double price;
@ManyToOne
private Category category;
private String description;
private String imageUrl;
}