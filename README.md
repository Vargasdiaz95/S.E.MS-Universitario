# Sistema Educativo Microservicios (S.E.MS-Universitario)

## Descripción del Sistema

Este proyecto tiene como objetivo transformar un sistema educativo en microservicios independientes utilizando Spring Boot y Spring Cloud. Cada microservicio gestionará una parte específica del sistema, permitiendo una arquitectura distribuida y escalable.

## Enfoque Distribuido

El sistema se divide en varios microservicios, cada uno responsable de una funcionalidad específica:

- **usuarios-servicio:** Gestión de estudiantes y docentes.
- **asignaturas-servicio:** CRUD de materias.
- **matriculas-servicio:** Registro de estudiantes en materias.

Cada microservicio tiene su propia base de datos y se comunica con los demás a través de Feign Client. La configuración y el descubrimiento de servicios se gestionan mediante un config-server y un eureka-server.

## Estructura del Repositorio

El repositorio está organizado de la siguiente manera:

- `usuarios-servicio/`: Código fuente y configuración del microservicio de usuarios.
- `asignaturas-servicio/`: Código fuente y configuración del microservicio de asignaturas.
- `matriculas-servicio/`: Código fuente y configuración del microservicio de matrículas.
- `config-server/`: Código fuente y configuración del servidor de configuración.
- `eureka-server/`: Código fuente y configuración del servidor Eureka.
- `README.md`: Descripción del sistema y el enfoque distribuido.

## Visión General del Sistema

El sistema educativo basado en microservicios permite una gestión eficiente y escalable de estudiantes, docentes y materias. La arquitectura distribuida facilita la integración y el despliegue de nuevas funcionalidades, mejorando la mantenibilidad y la resiliencia del sistema.

## Datos Personales

Incluye aquí tus datos personales y cualquier información relevante sobre los colaboradores del proyecto.

## Pasos para Ejecutar el Proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Vargasdiaz95/S.E.MS-Universitario
   cd S.E.MS-Universitario
   ```