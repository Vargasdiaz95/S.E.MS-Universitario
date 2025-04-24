/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculasservicio.service;

import com.example.matriculasservicio.entity.Matricula;
import com.example.matriculasservicio.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.matriculasservicio.client.UsuarioClient;
import com.example.matriculasservicio.client.AsignaturaClient;
import com.example.matriculasservicio.entity.Usuario;
import com.example.matriculasservicio.entity.Asignatura;

import java.util.List;

@Service
public class MatriculaService {
    
    
    //Configuracion por default
    @Autowired
    private MatriculaRepository matriculaRepository;

    public List<Matricula> getAllMatriculas() {
        return matriculaRepository.findAll();
    }

    public Matricula getMatriculaById(Long id) {
        return matriculaRepository.findById(id).orElse(null);
    }

    public Matricula saveMatricula(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    public void deleteMatricula(Long id) {
        matriculaRepository.deleteById(id);
    }

    public String registrarMatricula(long l, long l0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //Prueba unitaria para el microservicio matriculas-servicio
    @Autowired
    private UsuarioClient usuarioClient;

    @Autowired
    private AsignaturaClient asignaturaClient;

    public String registrarMatricula(Long usuarioId, Long asignaturaId) {
        Usuario usuario = usuarioClient.getUsuarioById(usuarioId);
        Asignatura asignatura = asignaturaClient.getAsignaturaById(asignaturaId);

        return "Matricula registrada: " + usuario.getNombre() + " en " + asignatura.getNombre();
    }
    
}