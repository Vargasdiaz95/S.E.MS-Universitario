package com.example.matriculasservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.example.matriculasservicio")
public class MatriculasServicioApplication {
    public static void main(String[] args) {
        SpringApplication.run(MatriculasServicioApplication.class, args);
    }
}
