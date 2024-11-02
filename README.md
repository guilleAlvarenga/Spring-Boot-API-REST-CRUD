# API REST para la Gestión de Usuarios

Este proyecto es una API REST desarrollada en Java usando **Spring Boot** para gestionar usuarios en una base de datos.

## Descripción

Esta API permite crear, leer, actualizar y eliminar usuarios en la base de datos. Utiliza **Spring Data JPA** para interactuar con una base de datos **MySQL** y está documentada con **Swagger**.

## Endpoints

### 1. Obtener todos los usuarios
- **URL:** `/user`
- **Método:** `GET`
- **Descripción:** Devuelve una lista de todos los usuarios registrados.
- **Respuesta exitosa:**
    ```json
    [
      {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com"
      }
    ]
    ```

### 2. Crear un usuario
- **URL:** `/user`
- **Método:** `POST`
- **Descripción:** Crea un nuevo usuario.
- **Cuerpo de la solicitud:**
    ```json
    {
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com"
    }
    ```
- **Respuesta exitosa:**
    ```json
    {
      "id": 1,
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com"
    }
    ```

### 3. Obtener usuario por ID
- **URL:** `/user/{id}`
- **Método:** `GET`
- **Descripción:** Obtiene un usuario por su `id`.
- **Respuesta exitosa:**
    ```json
    {
      "id": 1,
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com"
    }
    ```

### 4. Actualizar usuario por ID
- **URL:** `/user/{id}`
- **Método:** `PUT`
- **Descripción:** Actualiza un usuario específico.
- **Cuerpo de la solicitud:**
    ```json
    {
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com"
    }
    ```
- **Respuesta exitosa:**
    ```json
    {
      "id": 1,
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com"
    }
    ```

### 5. Eliminar usuario por ID
- **URL:** `/user/{id}`
- **Método:** `DELETE`
- **Descripción:** Elimina un usuario por su `id`.
- **Respuesta exitosa:**
    ```json
    {
      "message": "User with id {id} was deleted"
    }
    ```

### Configuración de la Base de Datos

Asegúrate de configurar correctamente los detalles de la base de datos en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/base_de_datos
spring.datasource.username=username
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```
### Documentación de la API

La documentación de la API está disponible a través de Swagger. Para acceder a la interfaz de Swagger UI, inicia la aplicación y dirígete a: http://localhost:8080/swagger-ui.html

### Requisitos

- **Java JDK 22**
- **MySQL**
- **Maven**
