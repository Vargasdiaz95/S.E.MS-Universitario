/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usuarios.controller;
import com.example.usuarios.entity.Estudiante;
import com.example.usuarios.entity.Docente;
import com.example.usuarios.service.EstudianteService;
import com.example.usuarios.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private DocenteService docenteService;

    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteService.obtenerTodos();
    }
    @PostMapping("/estudiantes")
    public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @DeleteMapping("/estudiantes/{id}")
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/docentes")
    public List<Docente> obtenerDocentes() {
        return docenteService.obtenerTodos();
    }
    @PostMapping("/docentes")
    public Docente guardarDocente(@RequestBody Docente docente) {
        return docenteService.guardar(docente);
    }

    @DeleteMapping("/docentes/{id}")
    public ResponseEntity<Void> eliminarDocente(@PathVariable Long id) {
        docenteService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
