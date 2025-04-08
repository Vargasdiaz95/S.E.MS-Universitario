
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

# Usar una imagen base de Java
FROM openjdk:11-jre-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR del microservicio
COPY target/asignaturas-servicio.jar asignaturas-servicio.jar

# Exponer el puerto
EXPOSE 8082

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "asignaturas-servicio.jar"]
