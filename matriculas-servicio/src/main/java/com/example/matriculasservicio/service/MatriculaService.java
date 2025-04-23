/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculasservicio.service;

import com.example.matriculasservicio.entity.Matricula;
import com.example.matriculasservicio.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

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
}
