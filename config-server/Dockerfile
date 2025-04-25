
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

# Usar una imagen base de Java
FROM openjdk:11-jre-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR del microservicio
COPY target/config-server-0.0.1-SNAPSHOT.jar config-server.jar

# Exponer el puerto
EXPOSE 8888

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "config-server.jar"]
