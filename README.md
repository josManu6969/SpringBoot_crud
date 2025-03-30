# API de Gestión de Estudiantes

## Breve descripción del proyecto
Este proyecto es una API RESTful desarrollada en **Spring Boot** que permite gestionar la información de estudiantes en un sistema educativo. 
Incluye operaciones CRUD (Agregar, Listar, Actualizar y Eliminar), facilitando el manejo eficiente de los datos de los estudiantes.

## Tecnologías utilizadas
- Java: Lenguaje principal del desarrollo.
- Spring Boot: Framework para la creación de aplicaciones web.
- Postman: Utilizado para probar los endpoints de la API.
- GitHub: Para versionamiento del código.

## Endpoints principales
- POST /api/estudiantes: Crear un nuevo estudiante.
- GET /api/estudiantes: Obtener todos los estudiantes.
- GET /api/estudiantes/{id}: Obtener un estudiante por su ID.
- PUT /api/estudiantes/{id}: Actualizar los datos de un estudiante.
- DELETE /api/estudiantes/{id}: Eliminar un estudiante.

## Instrucciones
1. Clona el repositorio:
   bash
   git clone https://github.com/josManu6969/Crud_SpringBoot.git
2. Abrir el proyecto en un IDE como IntelliJ IDEA o VScode.
3. Ejecutar la aplicación desde la clase principal `UniversidadApplication.java`.
4. La API estará disponible en `http://localhost:8082`.
