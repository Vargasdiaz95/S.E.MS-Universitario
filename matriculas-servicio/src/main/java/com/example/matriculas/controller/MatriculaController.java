/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculas.controller;

import com.example.matriculas.entity.Matricula;
import com.example.matriculas.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @PostMapping("/registrar")
    public ResponseEntity<Matricula> registrarMatricula(@RequestParam Long estudianteId, @RequestParam Long asignaturaId) {
        Matricula matricula = matriculaService.registrarMatricula(estudianteId, asignaturaId);
        if (matricula != null) {
            return ResponseEntity.ok(matricula);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    

}
