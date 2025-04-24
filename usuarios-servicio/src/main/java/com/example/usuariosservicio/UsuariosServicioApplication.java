package com.example.usuariosservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsuariosServicioApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsuariosServicioApplication.class, args);
    }
}
