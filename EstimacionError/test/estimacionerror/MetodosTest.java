/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estimacionerror;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class MetodosTest {
    
    public MetodosTest() {
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
     * Test of exponente method, of class Metodos.
     */
    @Test
    public void testExponente() {
        System.out.println("exponente");
        double e = 2.7182818281;
        double x = 0.5;
        Metodos instance = new Metodos();
        double expResult = 1.6487212705912422;
        double result = instance.exponente(e, x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Metodos.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int i = 0;
        Metodos instance = new Metodos();
        int expResult = 1;
        int result = instance.factorial(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of resultado method, of class Metodos.
     */
    @Test
    public void testResultado() {
        System.out.println("resultado");
        int vuelta = 1;
        double x = 0.5;
        Metodos instance = new Metodos();
        double expResult = 1;
        double result = instance.resultado(vuelta, x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of es method, of class Metodos.
     */
    @Test
    public void testEs() {
        System.out.println("es");
        double x = 0.5;
        double n = 3;
        Metodos instance = new Metodos();
        double expResult = 0.05;
        double result = instance.es(x, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of et method, of class Metodos.
     */
    @Test
    public void testEt() {
        System.out.println("et");
        double valVerdadero = 1.6487212705912422;
        double valAproximado = 1;
        Metodos instance = new Metodos();
        double expResult = 0.3934693402473097;
        double result = instance.et(valVerdadero, valAproximado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of ea method, of class Metodos.
     */
    @Test
    public void testEa() {
        System.out.println("ea");
        double aproxActual = 1;
        double aproxAnterior = 0;
        Metodos instance = new Metodos();
        double expResult = 100;
        double result = instance.ea(aproxActual, aproxAnterior);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of etp method, of class Metodos.
     */
    @Test
    public void testEtp() {
        System.out.println("etp");
        double et = 0.3934693402473097;
        Metodos instance = new Metodos();
        double expResult = 39.34693402473097;
        double result = instance.etp(et);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
    
}
