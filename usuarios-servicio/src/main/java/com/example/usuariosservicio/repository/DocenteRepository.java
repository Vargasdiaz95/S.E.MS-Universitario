/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usuariosservicio.repository;

import com.example.usuariosservicio.entity.Docente;
import com.example.usuariosservicio.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Usuario, Long> {

    public Docente save(Docente docente);
}