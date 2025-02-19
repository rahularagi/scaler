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



Query handling
* Declared queries 
  * * No need to write any SQL yourself
  * * just need to write a method name
  * * ORM will create Query based on method Name

C - create data
R - read data
U - update data
D - delete data