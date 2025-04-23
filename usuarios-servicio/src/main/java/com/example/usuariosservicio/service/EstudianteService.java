/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usuariosservicio.service;

import com.example.usuariosservicio.entity.Estudiante;
import com.example.usuariosservicio.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> encontrarTodos() {
        return estudianteRepository.findAll();
    }

    public Estudiante encontrarPorId(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public void eliminarPorId(Long id) {
        estudianteRepository.deleteById(id);
    }
}
