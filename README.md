# Task-Management-System

## Overview

The Task Management System API is a robust and scalable solution designed to manage tasks, projects, and user assignments. Built using Spring Boot, it leverages modern technologies such as Spring Security for authentication, JWT for token-based security, and PostgreSQL for data persistence. This API is designed to be the backend for a task management application, providing comprehensive CRUD operations and advanced features such as task assignment and status tracking.

## Features

- **User Management:** Registration, login, and role-based authentication.
- **Project Management:** Create, read, update, and delete projects.
- **Task Management:** CRUD operations for tasks, including assignment to users and status updates.
- **JWT Authentication:** Secure endpoints with JSON Web Tokens.
- **Swagger Documentation:** Interactive API documentation.
- **Containerization:** Docker support for easy deployment.
- **Kubernetes Deployment:** Scripts and manifests for deploying to a Kubernetes cluster.
- **Monitoring and Logging:** Integration with Prometheus, Grafana, and ELK Stack for comprehensive monitoring and logging.

## Technologies

- **Java 17**
- **Spring Boot 3.2.5**
- **Spring Data JPA**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **PostgreSQL**
- **Swagger**
- **Docker**
- **Kubernetes**
- **Prometheus & Grafana**
- **ELK Stack (Elasticsearch, Logstash, Kibana)**

## Getting Started

### Prerequisites

- Java 17
- Maven or Gradle
- PostgreSQL
- Docker (optional, for containerization)
- Kubernetes (optional, for deployment)

### Installation

1. **Clone the Repository**
   ```sh
   git clone https://github.com/jeremi-ah/task-management-system.git
   cd task-management-system
   ```

2. **Configure the Database**
   - Create a PostgreSQL database named `task_management_db`.
   - Update the database configuration in `src/main/resources/application.properties`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/task_management_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. **Build the Project**
   ```sh
   ./mvnw clean install
   ```

4. **Run the Application**
   ```sh
   ./mvnw spring-boot:run
   ```

### API Documentation

The API documentation is available via Swagger. Once the application is running, navigate to `http://localhost:8080/swagger-ui/` to explore the API endpoints.

## Usage

### Authentication

- **Register a new user**
  ```sh
  POST /api/auth/register
  ```
- **Login and retrieve JWT**
  ```sh
  POST /api/auth/login
  ```

### Projects

- **Create a new project**
  ```sh
  POST /api/projects
  ```
- **Retrieve all projects**
  ```sh
  GET /api/projects
  ```
- **Update a project**
  ```sh
  PUT /api/projects/{id}
  ```
- **Delete a project**
  ```sh
  DELETE /api/projects/{id}
  ```

### Tasks

- **Create a new task**
  ```sh
  POST /api/tasks
  ```
- **Retrieve all tasks**
  ```sh
  GET /api/tasks
  ```
- **Retrieve tasks by project**
  ```sh
  GET /api/projects/{projectId}/tasks
  ```
- **Update a task**
  ```sh
  PUT /api/tasks/{id}
  ```
- **Delete a task**
  ```sh
  DELETE /api/tasks/{id}
  ```

## Deployment

### Docker

1. **Build Docker Image**
   ```sh
   docker build -t task-management-system .
   ```

2. **Run Docker Container**
   ```sh
   docker run -d -p 8080:8080 task-management-system
   ```

### Kubernetes

1. **Create Kubernetes Deployment and Service Files**
   - `k8s/deployment.yaml`
   - `k8s/service.yaml`

2. **Deploy to Kubernetes Cluster**
   ```sh
   kubectl apply -f k8s/deployment.yaml
   kubectl apply -f k8s/service.yaml
   ```

## Monitoring and Logging

### Prometheus and Grafana

- Integrate Prometheus for metrics collection.
- Use Grafana for visualizing metrics.

### ELK Stack

- Configure Elasticsearch, Logstash, and Kibana for logging and monitoring.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue to discuss your ideas.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For further information or inquiries, please contact [jeremiahwafula01@gmail.com](mailto:[jeremiahwafula01@gmail.com).

---

This README provides a thorough overview of the project, setup instructions, and usage details, making it easy for others to understand and contribute to the project.
