package com.sgm.dataManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataManagementApplication{

	public static void main(String[] args) {
		SpringApplication.run(DataManagementApplication.class, args);
		/*
		 it is used to launch the application context
		 ApplicationContext: It is the core container in Spring that holds all of the beans defined in your application.
		 A bean is an object that is managed by the Spring container. The ApplicationContext also provides various services,
		 such as event handling, internationalization, and accessing resources.

          Bean Management: When you run a Spring Boot application, the ApplicationContext is initialized by SpringApplication.run().
          This context will scan your classes for annotations like @Component, @Service, @Repository, @Controller, and other Spring
          annotations that define beans, and it will create and manage them.

          Dependency Injection: The ApplicationContext also handles dependency injection (DI), which means it will inject beans into other beans as needed.
          For example, it automatically wires the dependencies (objects) that one class may need, and it does so without you having to manually create or manage them.

          SpringApplication.run(DatabaseManagementApplication.class, args);
          The SpringApplication.run() method initializes the Spring ApplicationContext, allowing Spring to manage all beans, configuration,
          and services within your application.
		*/

	}

}

//// https://github.com/ashbinbijuphilip/schoolattendencemanagementsystem/blob/main/README.md