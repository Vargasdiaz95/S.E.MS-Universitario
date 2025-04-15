/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.asignaturas.service;
import com.example.asignaturas.entity.Asignatura;
import com.example.asignaturas.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AsignaturaService {
    
    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public List<Asignatura> obtenerTodas() {
        return asignaturaRepository.findAll();
    }

    public Asignatura guardar(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    public void eliminar(Long id) {
        if (!asignaturaRepository.existsById(id)) {
            throw new EntityNotFoundException("Asignatura no encontrada con id: " + id);
        }
        asignaturaRepository.deleteById(id);
    }
}
