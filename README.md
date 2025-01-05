# Spring Boot Article API

This project is a RESTful API for managing articles. It provides functionality to create, retrieve, update, and delete articles. The project is built using Spring Boot and follows standard REST principles.

## Features

- **Retrieve all articles**
- **Retrieve an article by ID**
- **Create a new article**
- **Update an existing article**
- **Delete an article**

## Technologies Used

- **Java**
- **Spring Boot**
- **JPA (Java Persistence API)**
- **H2 Database** (can be replaced with other relational databases)
- **Maven**

## API Endpoints

### Base URL
```
http://localhost:8080/api/articles
```

### Endpoints

#### Get All Articles
```
GET /api/articles
```
Response:
```json
[
  {
    "id": 1,
    "title": "Introduction to Spring Boot",
    "content": "Spring Boot simplifies application development with its embedded server and pre-configured environment.",
    "tags": "spring, java, backend",
    "publishesDate": "2024-12-17"
  }
]
```

#### Get Article by ID
```
GET /api/articles/{id}
```
Response:
```json
{
  "id": 1,
  "title": "Introduction to Spring Boot",
  "content": "Spring Boot simplifies application development with its embedded server and pre-configured environment.",
  "tags": "spring, java, backend",
  "publishesDate": "2024-12-17"
}
```

#### Create an Article
```
POST /api/articles
```
Request Body:
```json
{
  "title": "New Article",
  "content": "This is the content of the article.",
  "tags": "example, test",
  "publishesDate": "2024-12-17"
}
```
Response:
```json
{
  "id": 2,
  "title": "New Article",
  "content": "This is the content of the article.",
  "tags": "example, test",
  "publishesDate": "2024-12-17"
}
```

#### Update an Article
```
PUT /api/articles/{id}
```
Request Body:
```json
{
  "title": "Updated Article",
  "content": "Updated content of the article.",
  "tags": "updated, example",
  "publishesDate": "2024-12-18"
}
```
Response:
```json
{
  "id": 2,
  "title": "Updated Article",
  "content": "Updated content of the article.",
  "tags": "updated, example",
  "publishesDate": "2024-12-18"
}
```

#### Delete an Article
```
DELETE /api/articles/{id}
```
Response:
```
204 No Content
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/springboot-article-api.git
   ```

2. Navigate to the project directory:
   ```bash
   cd springboot-article-api
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the API at `http://localhost:8080/api/articles`.

## Project Structure

- **`controller/`**: Contains the `ArticleController` for handling HTTP requests.
- **`service/`**: Contains the `ArticleService` for business logic.
- **`repository/`**: Contains the `ArticleRepository` interface for database interactions.
- **`model/`**: Contains the `Articel` entity class representing the article data.

## Database Configuration

The project uses an in-memory H2 database by default. The configuration can be found in the `application.properties` file:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

To switch to a different database (e.g., MySQL), update the `application.properties` file accordingly.

## Contributing

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature-name"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Create a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

For any questions or feedback, feel free to contact:
- **Name**: Prashant Nawale
- **Linkedin**: www.linkedin.com/in/prashant-nawale-a47505261
![Screenshot (129)](https://github.com/user-attachments/assets/7baed7ac-23fe-4725-97b8-f84dd608407e)
![Screenshot 2025-01-05 204650](https://github.com/user-attachments/assets/ac97524f-f05e-46de-a626-af8d093a6789)



