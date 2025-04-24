/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.usuariosservicio.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 *
 * @author farivadi
 */
public class SecurityConfigTest {
    
    public SecurityConfigTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of configure method, of class SecurityConfig.
     */
    @Test
    public void testConfigure() throws Exception {
        System.out.println("configure");
        HttpSecurity http = null;
        SecurityConfig instance = new SecurityConfig();
        instance.configure(http);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jwtAuthenticationFilter method, of class SecurityConfig.
     */
    @Test
    public void testJwtAuthenticationFilter() {
        System.out.println("jwtAuthenticationFilter");
        SecurityConfig instance = new SecurityConfig();
        JwtAuthenticationFilter expResult = null;
        JwtAuthenticationFilter result = instance.jwtAuthenticationFilter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
