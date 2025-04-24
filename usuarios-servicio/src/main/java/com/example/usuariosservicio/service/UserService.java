/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usuariosservicio.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Aquí deberías cargar el usuario desde la base de datos
        // Ejemplo:
        if ("user".equals(username)) {
            return new org.springframework.security.core.userdetails.User(
                    "user", "password", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }
}

