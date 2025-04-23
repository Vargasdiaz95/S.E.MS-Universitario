/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usuariosservicio.controller;
import com.example.usuariosservicio.entity.Docente;
import com.example.usuariosservicio.entity.Usuario;
import com.example.usuariosservicio.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Docente")
public class DocenteController {
    @Autowired
    private DocenteService docenteService;

    @GetMapping
    public List<Usuario> encontrarTodos() {
        return docenteService.encontrarTodos();
    }

    @GetMapping("/{id}")
    public Usuario encontrarPorId(@PathVariable Long id) {
        return docenteService.encontrarPorId(id);
    }

    @PostMapping
    public Docente guardar(@RequestBody Docente docente) {
        return docenteService.guardar(docente);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable Long id) {
        docenteService.eliminarPorId(id);
    }
}
