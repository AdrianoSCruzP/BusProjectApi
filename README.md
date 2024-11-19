# Technical Challenge - Bus Project

## Description
This project is a Spring Boot application that manages information about buses. It provides a REST API to perform CRUD operations on buses.

## Requirements
- Java 17
- Maven 3.6+
- MySQL

## Configuration
1. Clone the repository:
    ```sh
    git clone <REPOSITORY_URL>
    cd bus-project
    ```

2. Configure the MySQL database:
    - Create a database named `reto`.
    - Update the database credentials in the `src/main/resources/application.properties` file:
        ```ini
        spring.datasource.url=jdbc:mysql://localhost:3306/reto
        spring.datasource.username=root
        spring.datasource.password=root
        ```

3. Build and run the application:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

## Usage
The REST API provides the following endpoints:

### Get all buses
- **URL:** `/bus`
- **Method:** `GET`
- **Response:** List of bus resources.

### Get a bus by ID
- **URL:** `/bus/{id}`
- **Method:** `GET`
- **Response:** Bus resource with the specified ID.

## Project Structure
- `src/main/java`: Application source code.
    - `Reto.Tecnico.Buses.domain.model`: Domain models.
    - `Reto.Tecnico.Buses.domain.services`: Domain services.
    - `Reto.Tecnico.Buses.infrastructure.persistence.jpa.repositories`: JPA repositories.
    - `Reto.Tecnico.Buses.interfaces.rest`: REST controllers.
    - `Reto.Tecnico.Buses.interfaces.rest.resources`: REST resources.
    - `Reto.Tecnico.Buses.interfaces.rest.transform`: Entity to resource transformers.
- `src/main/resources`: Configuration files.
    - `application.properties`: Application configuration.

## Dependencies
The main dependencies used in this project are:
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- MySQL Connector/J
- Lombok

For more details, see the `pom.xml` file.

## Additional Documentation
For more information, see the [official Spring Boot documentation](https://spring.io/projects/spring-boot).

## Contributions
Contributions are welcome. Please open an issue or a pull request to discuss any changes you would like to make.

## License
This project is licensed under the terms of the MIT license.