/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usuarios.service;

import com.example.usuarios.entity.Docente;
import com.example.usuarios.entity.Usuario;
import com.example.usuarios.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    
    @Autowired
    private DocenteRepository docenteRepository;

    public List<Usuario> encontrarTodos() {
        return docenteRepository.findAll();
    }

    public Usuario encontrarPorId(Long id) {
        return docenteRepository.findById(id).orElse(null);
    }

    public Docente guardar(Docente docente) {
        return docenteRepository.save(docente);
    }

    public void eliminarPorId(Long id) {
        docenteRepository.deleteById(id);
    }
}
