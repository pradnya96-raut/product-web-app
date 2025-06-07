# Product Web Application

A Spring Boot-based web application for managing products. This application provides a RESTful API for product management with a modern web interface.

## Technology Stack

- Java 17
- Spring Boot 3.4.0
- Spring Data JPA
- H2 Database
- Maven
- Spring Boot DevTools
- Spring MVC
- Thymeleaf (for templating)

## Prerequisites

- JDK 17 or higher
- Maven 3.6.x or higher
- Your favorite IDE (IntelliJ IDEA, Eclipse, etc.)

## Getting Started

1. Clone the repository:
```bash
git clone [repository-url]
cd product-web-app
```

2. Build the project:
```bash
./mvnw clean install
```

3. Run the application:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── telusko/
│   │           └── TestWebApp/
│   │               ├── Controller/    # REST controllers
│   │               ├── Service/       # Business logic
│   │               ├── Repo/          # Data access layer
│   │               ├── Model/         # Entity classes
│   │               └── TestWebAppApplication.java
│   └── resources/
│       ├── static/     # Static resources (CSS, JS, images)
│       ├── templates/  # Thymeleaf templates
│       └── application.properties
└── test/              # Test files
```

## Features

- RESTful API endpoints for product management
- H2 in-memory database for development
- Spring Data JPA for data persistence
- Spring Boot DevTools for development convenience
- MVC architecture with clear separation of concerns
- Thymeleaf templating for web views

## Development

The project uses Spring Boot DevTools which provides:
- Automatic application restart when files change
- Live reload for web resources
- Enhanced development experience

### Project Architecture

The application follows a standard layered architecture:
- **Controller Layer**: Handles HTTP requests and responses
- **Service Layer**: Contains business logic
- **Repository Layer**: Manages data persistence
- **Model Layer**: Defines entity classes

## Testing

Run the test suite using:
```bash
./mvnw test
```

## Configuration

The application uses `application.properties` for configuration. Key configurations include:
- Database settings
- Server port
- Application-specific properties


## Support

For any issues or questions, please [create an issue](repository-issues-url) in the repository.