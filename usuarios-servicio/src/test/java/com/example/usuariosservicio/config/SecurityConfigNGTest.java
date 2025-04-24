/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.example.usuariosservicio.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import static org.testng.Assert.*;

/**
 *
 * @author farivadi
 */
public class SecurityConfigNGTest {
    
    public SecurityConfigNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of configure method, of class SecurityConfig.
     */
    @org.testng.annotations.Test
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
    @org.testng.annotations.Test
    public void testJwtAuthenticationFilter() {
        System.out.println("jwtAuthenticationFilter");
        SecurityConfig instance = new SecurityConfig();
        JwtAuthenticationFilter expResult = null;
        JwtAuthenticationFilter result = instance.jwtAuthenticationFilter();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
