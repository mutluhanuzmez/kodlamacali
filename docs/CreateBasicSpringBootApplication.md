# Creating a Spring Project for todo Application

## Steps

1. Create Project with Spring Initializr
2. Create Folder Structure

## Create Project With Spring Initializr

If you are using IntelliJ ultimate edition, you can directly create a project in IDE using spring initializr. If you do not have the Ultimate edition you can follow the link. https://start.spring.io/

- Select Maven Project
- Select Java
- Select default(2.2.4) Spring Boot version

### Project Metadata
- Group: Can be company name
- Artifact: Can be project name
- Packaging: JAR
- Java 8

### Dependencies

#### Developer Tools
- Spring Boot DevTools
- Lombok
- Spring Configuration Processor

#### Web
- Spring Web
- Rest Repositories

#### SQL
- Spring Data JPA
- H2 DB

## Create Folder Structure

In order to build an MVC structure, we wanted to divide the model, controller, service and repostiry in different packages.

In src/main/java/com.<groupName\>.<artifact\> we creted 4 new packages.

- controller

- service

- model

- repository

	
	
	
```java

private void getHazal(@RequestBody)
```

Bunu bu yüzden kullanırsınız.


```java

private void getHazal(@RequestParam)
```

Bunu şurada kullanırsınız.

​	