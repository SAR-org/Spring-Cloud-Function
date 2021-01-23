# Spring-Cloud-Function
Spring cloud function example

In a usual Spring Boot application we have to expose rest endpoints to invoke a function using the https methods, such as @RequestMapping,GetMapping,PostMapping, etc.

But using Spring cloud function, we can leverage the Java 8's functionals interfaces such as Function, Consumer and Supplier, and expose an API's directly without using the http methods

This example is simplest form of exposing APIs using functional program.

1. Create a simple Springboot application without any dependecies
2. Add below dependecies into pom manually and let it download the libs
    <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-function-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-function-compiler</artifactId>
		</dependency>
    
3. Write the functions which uses one of the functional interface


We also can write this using seperate classes as well, as follows

class TestFunction implements Function<String,String>{
  
  @Override
	public String apply(String input) {
		
		return "Function is applied on "+input;
	}

}

In addition to this, we need to provide either add @Component at to class TestFunction or we can add component scan property in application.properties file

#spring.cloud.function.scan.packages= com.spring.cloud

We in this project, three end points are exposed directly as functions and one end point exposed by overidding Function<T,R> interface. Following are the endpoints
# http://localhost:8080/supplier
# http://localhost:8080/function
# http://localhost:8080/consume
Here the method names are the endpoint names
# http://localhost:8080/testFunction
Here the class name will be the endpoint name(camel case)
