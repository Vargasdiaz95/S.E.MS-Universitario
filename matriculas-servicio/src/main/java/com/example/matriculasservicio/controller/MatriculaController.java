/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculasservicio.controller;

import com.example.matriculasservicio.entity.Matricula;
import com.example.matriculasservicio.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public List<Matricula> getAllMatriculas() {
        return matriculaService.getAllMatriculas();
    }

    @GetMapping("/{id}")
    public Matricula getMatriculaById(@PathVariable Long id) {
        return matriculaService.getMatriculaById(id);
    }

    @PostMapping
    public Matricula saveMatricula(@RequestBody Matricula matricula) {
        return matriculaService.saveMatricula(matricula);
    }

    @DeleteMapping("/{id}")
    public void deleteMatricula(@PathVariable Long id) {
        matriculaService.deleteMatricula(id);
    }
}
