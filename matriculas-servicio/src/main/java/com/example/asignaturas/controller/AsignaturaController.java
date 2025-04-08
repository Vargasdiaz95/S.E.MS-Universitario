/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.asignaturas.controller;

import com.example.asignaturas.entity.Asignatura;
import com.example.asignaturas.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AsignaturaController {
    
    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public List<Asignatura> obtenerAsignaturas() {
        return asignaturaService.obtenerTodas();
    }

    @PostMapping
    public Asignatura guardarAsignatura(@RequestBody Asignatura asignatura) {
        return asignaturaService.guardar(asignatura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAsignatura(@PathVariable Long id) {
        asignaturaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
