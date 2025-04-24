/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.matriculasservicio;

import com.example.matriculasservicio.client.UsuarioClient;
import com.example.matriculasservicio.client.AsignaturaClient;
import com.example.matriculasservicio.entity.Usuario;
import com.example.matriculasservicio.entity.Asignatura;
import com.example.matriculasservicio.service.MatriculaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MatriculaServiceTest {
    
    /**
    @Mock
    private UsuarioClient usuarioClient;

    @Mock
    private AsignaturaClient asignaturaClient;

    @InjectMocks
    private MatriculaService matriculaService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegistrarMatricula() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Juan Perez");
        usuario.setEmail("juan.perez@example.com");

        Asignatura asignatura = new Asignatura();
        asignatura.setId(1L);
        asignatura.setNombre("Matemáticas");
        asignatura.setDescripcion("Curso de matemáticas básicas");

        when(usuarioClient.getUsuarioById(1L)).thenReturn(usuario);
        when(asignaturaClient.getAsignaturaById(1L)).thenReturn(asignatura);

        String resultado = matriculaService.registrarMatricula(1L, 1L);

        assertEquals("Matricula registrada: Juan Perez en Matemáticas", resultado);
    }
    */
}
