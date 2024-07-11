# Spring Security Examples

## Introduction

This repository contains a collection of examples demonstrating the use of Spring Security for securing Java
applications. It covers various aspects of authentication, authorization, and other security features provided by Spring
Security.

## Table of Contents

- [Introduction](#introduction)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Examples](#examples)
- [Configuration](#configuration)
- [Running the Examples](#running-the-examples)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- Java 11 or higher
- Maven 3.6 or higher
- Git

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/shelltechsolutionsllc/spring-security.git
   ```
2. Navigate to the project directory:
   ```sh
   cd spring-security
   ```

## Examples

This repository includes various examples demonstrating different features of Spring Security:

- **Basic Authentication**: Demonstrates HTTP Basic authentication.
- **Form-Based Authentication**: Shows how to set up a custom login form.
- **Method-Level Security**: Uses annotations to secure methods.
- **OAuth2 Login**: Shows how to integrate with OAuth2 providers.
- **JWT Authentication**: Demonstrates the use of JWT for stateless authentication.

## Configuration

Each example is configured independently and can be run separately. Configuration files are provided within each
example's directory.

### Application Properties

Properties for each example are defined in `application.properties` or `application.yml` files located in
the `src/main/resources` directory of each example.

### Security Configuration

Security configurations are implemented in the `SecurityConfig` classes within each example. These classes demonstrate
different ways to configure security settings such as authentication providers, security filters, and access rules.

## Running the Examples

To run an example, follow these steps:

1. **Navigate to the example directory**:
   ```sh
   cd basic-authentication
   ```

2. **Build the project**:
   ```sh
   mvn clean install
   ```

3. **Run the application**:
   ```sh
   mvn spring-boot:run
   ```

Each example can be accessed through `http://localhost:8080` or the configured port.

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m 'Add your feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, please contact [ShellTech Solutions LLC](mailto:info@monis-consulting.com).
