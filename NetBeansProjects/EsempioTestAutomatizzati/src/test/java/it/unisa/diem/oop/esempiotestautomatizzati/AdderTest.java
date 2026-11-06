/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.esempiotestautomatizzati;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author antagoni
 */
public class AdderTest {
    
    public AdderTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /*
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
    */
    
    /**
     * Test of add method, of class Adder.
     */
    
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        Adder instance = new Adder();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add2");
        int a = 2;
        int b = 3;
        Adder instance = new Adder();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
    
    // FIXTURE
    /*private Adder a;
    
    @BeforeEach
    public void setUp() {
        a = new Adder();
    }
    
    @Test
    public void testAddPositive() {
        assertEquals(7, a.add(4, 3));
    }
    
    @Test
    public void testAddNegative() {
        assertEquals(5, a.add(10, 5));
    }
    */
}
