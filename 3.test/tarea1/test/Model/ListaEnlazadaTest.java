/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanPablo
 */
public class ListaEnlazadaTest {
    
    public ListaEnlazadaTest() {
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
     * Test of getNodoInicial method, of class ListaEnlazada.
     */
    @Test
    public void testGetNodoInicial() {
        System.out.println("getNodoInicial");
        ListaEnlazada instance = new ListaEnlazada();
        Nodo expResult = null;
        Nodo result = instance.getNodoInicial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodoInicial method, of class ListaEnlazada.
     */
    @Test
    public void testSetNodoInicial() {
        System.out.println("setNodoInicial");
        Nodo NodoInicial = null;
        ListaEnlazada instance = new ListaEnlazada();
        instance.setNodoInicial(NodoInicial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodoFinal method, of class ListaEnlazada.
     */
    @Test
    public void testGetNodoFinal() {
        System.out.println("getNodoFinal");
        ListaEnlazada instance = new ListaEnlazada();
        Nodo expResult = null;
        Nodo result = instance.getNodoFinal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodoFinal method, of class ListaEnlazada.
     */
    @Test
    public void testSetNodoFinal() {
        System.out.println("setNodoFinal");
        Nodo NodoFinal = null;
        ListaEnlazada instance = new ListaEnlazada();
        instance.setNodoFinal(NodoFinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcularMedia method, of class ListaEnlazada.
     */
    @Test
    public void testCalcularMedia() {
        System.out.println("CalcularMedia");
        ListaEnlazada instance = new ListaEnlazada();
        double expResult = 0.0;
        double result = instance.CalcularMedia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
