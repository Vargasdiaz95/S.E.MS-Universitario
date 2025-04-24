package com.example.usuariosservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.example.usuariosservicio")
public class UsuariosServicioApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsuariosServicioApplication.class, args);
    }
}
