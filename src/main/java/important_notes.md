# Types of testing
* Unit testing
    * Will cover almost all methods with mocking other dependencies
* integration testing
    * it will mock dependencies
* Functional testing
  * Testing through actual api
  
* Test cases are written in 3A
 - Arrange
 - Act
 - Assert

# Types dependency mocking in testing (Doubles)
* Mock
  - hard code the object
* Stub
  - A class that implements the same interface as dependency
  - Replicate in hacky way
  - A class that we create which tries replicate behaviour of real class
  - Interface --> productRepository implements stub in test class
* fake
  - creating database behavior by saving in hashmap
  - creating fake repository by implementing it repository interface
  - y- 4
  - 3
  - 
  - Interface --> productRepository implements stub in test class
  
# important topic in testing
* JUnit
* Mockito
* AssertJ