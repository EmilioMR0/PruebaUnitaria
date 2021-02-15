/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaUnitaria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Emilio
 */
public class CCuentaTest {
     CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
    public CCuentaTest(String testName) {
        super(testName);
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    protected void setUp() throws Exception {
        double prueba = 250;
        instance ingresar(prueba);
        System.out.println("El saldo al inicio es: " +prueba);
        super.setUp();
    }

    @org.junit.jupiter.api.AfterEach
    protected void tearDown() throws Exception {
        super.tearDown();
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
     * Test of asignarNombre method, of class CCuenta.
     */
    @org.junit.jupiter.api.Test
    public void testAsignarNombre() {
        System.out.println("asignarNombre");
        String nom = "";
        CCuenta instance = new CCuenta();
        instance.asignarNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNombre method, of class CCuenta.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estado method, of class CCuenta.
     */
    @org.junit.jupiter.api.Test
    public void testEstado() {
        System.out.println("estado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.estado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    @org.junit.jupiter.api.Test
    public void testRetirarIngresar() throws Exception{
        System.out.println("Prueba de ingreso/retirada");
        double cantidad = 1000.0;
        double cantidad2 = 250.0;
        System.out.printf("Antes de retirar dinero tenemos que%.2f\n",instance.estado());
        instance.retirar(cantidad);
        System.out.printf("Retiramos %.2f y nos queda %.2f\n",instance.estado());
        instance.ingresar(cantidad2);
        System.out.printf("Después de ingresar %.2f tenemos %.2f\n",cantidad,instance.estado());
        CCuenta instance = new CCuenta();
        instance.ingresar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.")
    }
    public void testIngresar() throws Exception {
        System.out.println("Prueba de ingresar");
        double cantidad2 = 250.0;
        instance.ingresar(cantidad2);
        assertNotNull("Debería tener valor",instance.estado()); //para saber si el saldo tiene valor
        assertEquals(
                "Debe dar 2750 (2500 que tenía mas 250 que se ingresan)",
                2750.0,
                instance.estado()
        );
        CCuenta instance = new CCuenta();
        instance.ingresar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @org.junit.jupiter.api.Test
    public void testRetirar() throws Exception {
        System.out.println("Prueba del método retirar");
        double cantidad = 1000.0;
        instance.retirar(cantidad);
        assertEquals(
                "Debe dar 1500 (2500 que tenía menos 1000 que se retiran)",
                1500.0,
                instance.estado()
        );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCuenta method, of class CCuenta.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerCuenta() {
        System.out.println("obtenerCuenta");
        CCuenta instance = new CCuenta();
        String expResult = "";
        String result = instance.obtenerCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
