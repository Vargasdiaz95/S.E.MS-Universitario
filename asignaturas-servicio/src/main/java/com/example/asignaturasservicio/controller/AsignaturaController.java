/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.asignaturasservicio.controller;

import com.example.asignaturasservicio.entity.Asignatura;
import com.example.asignaturasservicio.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asignaturas")
public class AsignaturaController {
    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaService.getAllAsignaturas();
    }

    @GetMapping("/{id}")
    public Asignatura getAsignaturaById(@PathVariable Long id) {
        return asignaturaService.getAsignaturaById(id);
    }

    @PostMapping
    public Asignatura saveAsignatura(@RequestBody Asignatura asignatura) {
        return asignaturaService.saveAsignatura(asignatura);
    }

    @DeleteMapping("/{id}")
    public void deleteAsignatura(@PathVariable Long id) {
        asignaturaService.deleteAsignatura(id);
    }
}
