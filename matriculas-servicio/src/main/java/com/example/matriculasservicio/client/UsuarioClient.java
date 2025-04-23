/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculasservicio.client;


import com.example.usuariosservicio.entity.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuarios-servicio", url = "http://localhost:8081")
public interface UsuarioClient {
    @GetMapping("/usuario/{id}")
    Usuario encontrarPorId(@PathVariable Long id);
}
