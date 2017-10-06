/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.Modelo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Familia
 */
public class ServiceTest {
    
    public ServiceTest() {
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
     * Test of procesar method, of class Service.
     */
    /*@Test
    public void testProcesar() {
        System.out.println("procesar");
        double volumen = 26;
        Service instance = new Service();
        Modelo[] expResult = null;
        Modelo[] result = instance.procesar(volumen);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of calcularMonto method, of class Service.
     */
    @Test
    public void testCalcularMonto() {
        System.out.println("calcularMonto");
        double volumen = 26;
        Service instance = new Service();
        double expResult = 100;
        double result = instance.calcularMonto(volumen);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("No esta bien!");
        }
    }

    /**
     * Test of prepararReporte method, of class Service.
     */
    /*@Test
    public void testPrepararReporte() {
        System.out.println("prepararReporte");
        Service instance = new Service();
        Modelo[] expResult = null;
        Modelo[] result = instance.prepararReporte();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
