/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculas.service;

import com.example.matriculas.client.UsuarioClient;
import com.example.matriculas.client.AsignaturaClient;
import com.example.matriculas.entity.Matricula;
import com.example.matriculas.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {
    
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private UsuarioClient usuarioClient;

    @Autowired
    private AsignaturaClient asignaturaClient;

    public List<Matricula> encontrarTodas() {
        return matriculaRepository.findAll();
    }

    public Matricula encontrarPorId(Long id) {
        return matriculaRepository.findById(id).orElse(null);
    }
    public Matricula guardar(Matricula matricula) {
        // Simular la matrícula completa
        Usuario usuario = usuarioClient.encontrarPorId(matricula.getUsuarioId());
        Asignatura asignatura = asignaturaClient.encontrarPorId(matricula.getAsignaturaId());
        if (usuario != null && asignatura != null) {
            return matriculaRepository.save(matricula);
        }
        return null;
    }

    public void eliminarPorId(Long id) {
        matriculaRepository.deleteById(id);
    }
}
