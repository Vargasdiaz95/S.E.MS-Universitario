/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculas.repository;

import com.example.matriculas.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}