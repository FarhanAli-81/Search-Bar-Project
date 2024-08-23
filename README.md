# Search Bar Project

## Overview

Service for filtering manufacturers based on criteria using a Spring Boot application with H2 database. Pagination is done.

## Architecture

- Controller
- Service
- Repository
- Models / Entities
- Exception Handling
- DTOs
- Data Insertion
- Pagination

## How to Run

1. Run the Spring Boot application.
2. Data is inserted into H2 database automatically.
3. Access H2 Console at [http://localhost:8080/h2-console](http://localhost:8080/h2-console).

## Endpoints

### Filtering Manufacturers

- **URL:** `POST /api/supplier/search`
- **Request Body:**
    ```json
    {
    "nature": "medium_scale",
    "manufacture": "casting",
    "country": "India"
}
    ```

    
### To check pagination
- **URL:** `POST /api/supplier/search?pageNumber=0&pageSize=3`
- **Request Body:**
    ```json
    {
    "nature": "medium_scale",
    "manufacture": "casting",
    "country": "India"
}
    ```

### Testing Exception Handling

- **URL:** `POST /api/supplier/search`
- **Request Body:**
    ```json
      {
  "nature": "medium_scale",
  "manufacture": "moulding",
  "country": "India"
}
    ```

## Entities

- Supplier
- Location
