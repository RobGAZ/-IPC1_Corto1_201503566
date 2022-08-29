/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto12s_2022;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ROGA11
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AreaCuadrado method, of class Operaciones.
     */
    @Test
    public void testAreaCuadrado() {
        System.out.println("AreaCuadrado");
        int x = 3;
        int expResult = 9;
        int result = Operaciones.AreaCuadrado(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of VolCubo method, of class Operaciones.
     */
    @Test
    public void testVolCubo() {
        System.out.println("VolCubo");
        int x = 2;
        int expResult = 8;
        int result = Operaciones.VolCubo(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of AreaCirculo method, of class Operaciones.
     */
    @Test
    public void testAreaCirculo() {
        System.out.println("AreaCirculo");
        int r = 2;
        float expResult = 12.56F;
        float result = Operaciones.AreaCirculo(r);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of VolEsfera method, of class Operaciones.
     */
    @Test
    public void testVolEsfera() {
        System.out.println("VolEsfera");
        int r = 2;
        float expResult = 16.57F;
        float result = Operaciones.VolEsfera(r);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
