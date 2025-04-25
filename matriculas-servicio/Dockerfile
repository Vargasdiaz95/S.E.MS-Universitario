
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR del microservicio al contenedor
#COPY target/matriculas-servicio.jar matriculas-servicio.jar
COPY target/matriculas-servicio-0.0.1-SNAPSHOT.jar matriculas-servicio.jar

# Exponer el puerto en el que la aplicación se ejecutará
EXPOSE 8082

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "matriculas-servicio.jar"]
