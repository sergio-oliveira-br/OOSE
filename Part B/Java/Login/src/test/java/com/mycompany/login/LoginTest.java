/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sergiovinicio
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of Login method, of class Login.
     */
    @Test
    public void testLoginBlank() {
        System.out.println("Login -> All Blank");
        String username = "";
        String password = "";
        int expResult = 0;
        int result = Login.Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of Login method, of class Login.
     */
    @Test
    public void testLoginAllRightSergio() {
        System.out.println("Login -> Correct User and Password");
        String username = "oliveira-sergio";
        String password = "Brazil123";
        int expResult = 1;
        int result = Login.Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of Login method, of class Login.
     */
    @Test
    public void testLoginWrongPassword() {
        System.out.println("Login -> Correct User and Wrong Passord ");
        String username = "oliveira-sergio";
        String password = "BraziL123";
        int expResult = 0;
        int result = Login.Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of Login method, of class Login.
     */
    @Test
    public void testLoginAllRightAdmin() {
        System.out.println("Login -> Correct User and Passord ");
        String username = "Admin123";
        String password = "Admin123";
        int expResult = 1;
        int result = Login.Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of Login method, of class Login.
     */
    @Test
    public void testLoginAllRightAdminButExpResultWrong() {
        System.out.println("Login -> Correct User and Passord, but expResult = 0 ");
        String username = "Admin123";
        String password = "Admin123";
        int expResult = 0;
        int result = Login.Login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
