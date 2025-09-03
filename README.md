# 🛒 Spring Boot Supermarket API

Este es un proyecto de **API REST** desarrollado con **Spring Boot** como parte de mi aprendizaje.  
La aplicación simula la gestión de un supermercado, permitiendo administrar productos y compras.  
Además, incluye documentación interactiva con **Swagger (OpenAPI)**.

---

## 🚀 Características

- Creación de aplicaciones autocontenidas con **Spring Boot**.
- Arquitectura en capas (controladores, servicios, repositorios, entidades).
- Gestión de base de datos con **Spring Data JPA** y **PostgreSQL**.
- Uso de **MapStruct** para la conversión entre entidades y DTOs.
- Documentación automática con **Swagger UI**.

---

## 🛠️ Tecnologías utilizadas

- **Java 21**
- **Spring Boot 3.5.5**
- **Spring Data JPA**
- **PostgreSQL**
- **Gradle**
- **MapStruct**
- **Swagger / OpenAPI**

---

## 📌 Acceder a la documentación Swagger
👉 [http://localhost:8090/plat-mar/api/swagger-ui/index.html](http://localhost:8090/plat-mar/api/swagger-ui/index.html)

---

## 📌 Endpoints principales

### 📦 Productos
- `GET /products/all` → Lista todos los productos  
- `GET /products/{id}` → Obtiene un producto por ID  
- `GET /products/category/{categoryId}` → Lista productos por categoría  
- `POST /products/save` → Guarda un nuevo producto  
- `DELETE /products/delete/{id}` → Elimina un producto por ID  

### 🛒 Compras (ejemplo)
- `GET /purchases/all` → Lista todas las compras  
- `POST /purchases/save` → Guarda una nueva compra  

---

## 📦 Instalación y ejecución

1. Clonar el repositorio:
	
```
git clone https://github.com/SiliusJM/SpringBoot-Supermarket-Api.git
```

   
   
