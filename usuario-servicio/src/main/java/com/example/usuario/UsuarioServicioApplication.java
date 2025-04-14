package com.example.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UsuarioServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioServicioApplication.class, args);
	}

}
