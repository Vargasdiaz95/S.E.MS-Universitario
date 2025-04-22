/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculas.controller;

import com.example.matriculas.entity.Matricula;
import com.example.matriculas.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Matricula")
public class MatriculaController {
    
    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public List<Matricula> encontrarTodas() {
        return matriculaService.encontrarTodas();
    }

    @GetMapping("/{id}")
    public Matricula encontrarPorId(@PathVariable Long id) {
        return matriculaService.encontrarPorId(id);
    }

    @PostMapping
    public Matricula guardar(@RequestBody Matricula matricula) {
        return matriculaService.guardar(matricula);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable Long id) {
        matriculaService.eliminarPorId(id);
    }
}
