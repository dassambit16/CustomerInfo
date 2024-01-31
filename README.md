# Spring Boot User Management System

A Spring Boot application with RESTful APIs for user management. This project includes backend APIs for user authentication, authorisation, adding, updating, deleting, and retrieving user information.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Running the Application](#running-the-application)
- [Authentication and Authorization](#authentication-and-authorization)

## Technologies Used

- Spring Boot
- Spring Data JPA
- Lombok
- HTML

## Project Structure

- **src/main/java/com/assignment/PP_fs11_CustomerInfo/Controller**: Contains the RESTful controllers.
- **src/main/java/com/assignment/PP_fs11_CustomerInfo/Model**: Defines the data models, including `LoginDetails` and `UserInfo`.
- **src/main/java/com/assignment/PP_fs11_CustomerInfo/Service**: Contains the service layer, including `UserService`.
- **src/main/java/com/assignment/PP_fs11_CustomerInfo/Repository**: Spring Data JPA repositories.
- **src/main/resources/static**: Place for static files (HTML, CSS).

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21
- Maven

### Dependencies

- [spring-boot-starter-oauth2-client](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#boot-features-oauth2-client)
- [springdoc-openapi-starter-webmvc-ui](https://springdoc.org/)
- [spring-boot-starter-data-jpa](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)
- [spring-boot-starter-web](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#boot-features-developing-web-applications)
- [spring-boot-starter-security](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#boot-features-security)
- [mysql-connector-j](https://mvnrepository.com/artifact/mysql/mysql-connector-java)
- [lombok](https://projectlombok.org/)
- [spring-boot-starter-test](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#boot-features-testing)

### Authentication and Authorization

The project uses Spring Security for authentication and authorization. The `spring-boot-starter-security` dependency is included in the project, and the application is secured by default.

- **Authentication**: The application supports OAuth2 client authentication. You can customize the authentication process by modifying the configuration in `SecurityConfig.java` class.

- **Authorization**: The project includes basic role-based authorization using the `Role` enum. The `@PreAuthorize` annotation is used in the `UserController` class to restrict access to certain endpoints based on user roles.

For detailed security configuration, refer to the [SecurityConfig](src/main/java/com/assignment/PP_fs11_CustomerInfo/Security/SecurityConfig.java) class.
