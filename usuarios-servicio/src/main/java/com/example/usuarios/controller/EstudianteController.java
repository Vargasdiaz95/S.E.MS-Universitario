/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usuarios.controller;

import com.example.usuarios.entity.Estudiante;
import com.example.usuarios.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Estudiante")
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> encontrarTodos() {
        return estudianteService.encontrarTodos();
    }

    @GetMapping("/{id}")
    public Estudiante encontrarPorId(@PathVariable Long id) {
        return estudianteService.encontrarPorId(id);
    }

    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable Long id) {
        estudianteService.eliminarPorId(id);
    }
}
