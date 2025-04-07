/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculas.service;

import com.example.asignaturas.entity.Asignatura;
import com.example.matriculas.client.AsignaturasClient;
import com.example.matriculas.client.UsuariosClient;
import com.example.matriculas.entity.Matricula;
import com.example.matriculas.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private UsuariosClient usuariosClient;

    @Autowired
    private AsignaturasClient asignaturasClient;

    public Matricula registrarMatricula(Long estudianteId, Long asignaturaId) {
        Usuario usuario = usuariosClient.obtenerUsuario(estudianteId);
        Asignatura asignatura = asignaturasClient.obtenerAsignatura(asignaturaId);
        if (usuario != null && asignatura != null) {
            Matricula matricula = new Matricula();
            matricula.setEstudianteId(estudianteId);
            matricula.setAsignaturaId(asignaturaId);
            return matriculaRepository.save(matricula);
        }
        return null;
    }
    
}
