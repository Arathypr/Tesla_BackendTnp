# Image and Vehicle Image Management API

## Overview

This project is a Spring Boot application designed to manage image details and associated vehicle images. It provides RESTful endpoints for creating, reading records, as well as specific queries like finding vehicle images by color.

## Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)

## Architecture

### Entities

- **ImageDetails**: Represents an image detail with a title, description, and a list of associated vehicle images.
- **VehicleImage**: Represents a vehicle image with a URL and color.

### Repositories

- **VehicleImageRepo**: CRUD operations for `VehicleImage`.
- **ImageDetailsRepo**: CRUD operations for `ImageDetails`.

### Services

- **VehicleImageService**: Business logic for `VehicleImage`.
- **ImageDetailsService**: Business logic for `ImageDetails`.

### Controllers

- **VehicleImageController**: Endpoints for managing `VehicleImage`.
- **ImageDetailsController**: Endpoints for managing `ImageDetails`.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher
- MySQL database

### Setup

1. **Clone the repository**
    ```bash
    git clone https://github.com/Arathypr/Tesla_BackendTnp
    Tesla_BackendTnp
    ```

2. **Configure the database**
    Update `application.properties` (or `application.yml`) with your MySQL database configurations.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdbname
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build and run the application**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Endpoints

### VehicleImageController

- **POST** `/api/vehicleImage/postVehicleImage`
    - Description: Add a new vehicle image.
    - Request Body: `VehicleImage` object.

- **GET** `/api/vehicleImage/getVehicleImagesByColor`
    - Description: Get vehicle images by color.
    - Query Param: `color` (e.g., `RED`, `BLUE`).

- **GET** `/api/vehicleImage/getVehicleImageByVehicleId`
    - Description: Get vehicle image by vehicle ID.
    - Query Param: `vehicleId`.

- **GET** `/api/vehicleImage/getAllVehicleImages`
    - Description: Get all vehicle images.

### ImageDetailsController

- **POST** `/api/imageDetails/postImageDetails`
    - Description: Add new image details.
    - Request Params: `title`, `description` (optional).
    - Request Body: List of vehicle images.

- **GET** `/api/imageDetails/getImageDetailsById`
    - Description: Get image details by ID.
    - Query Param: `imageId`.

- **GET** `/api/imageDetails/getImageDetailsByVehicleIdAndImageIdAndColor`
    - Description: Get image details by vehicle ID, image ID, and color.
    - Query Params: `vehicleId`, `imageId`, `color`.

- **GET** `/api/imageDetails/getAllImageDetails`
    - Description: Get all image details.

## Dependencies

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- MySQL Connector
- Lombok
- Spring Boot Starter Test

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code follows the existing code style and includes appropriate tests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
