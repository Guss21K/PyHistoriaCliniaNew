/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author jean2
 */
public class PacienteTest {
    
    public PacienteTest() {
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
     * Test of getApellidoP method, of class Paciente.
     */
    @Test
    public void testGetApellidoP() {
        System.out.println("getApellidoP");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getApellidoP();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApellidoP method, of class Paciente.
     */
    @Test
    public void testSetApellidoP() {
        System.out.println("setApellidoP");
        String ApellidoP = "";
        Paciente instance = new Paciente();
        instance.setApellidoP(ApellidoP);
    }

    /**
     * Test of getApellidoM method, of class Paciente.
     */
    @Test
    public void testGetApellidoM() {
        System.out.println("getApellidoM");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getApellidoM();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApellidoM method, of class Paciente.
     */
    @Test
    public void testSetApellidoM() {
        System.out.println("setApellidoM");
        String ApellidoM = "";
        Paciente instance = new Paciente();
        instance.setApellidoM(ApellidoM);
    }

    /**
     * Test of getNombres method, of class Paciente.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombres method, of class Paciente.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String Nombres = "";
        Paciente instance = new Paciente();
        instance.setNombres(Nombres);
    }

    /**
     * Test of InsertarPaciente method, of class Paciente.
     */
    @Test
    public void testInsertarPaciente() {
        System.out.println("InsertarPaciente");
        JTextField paramApellidoP = null;
        JTextField paramApellidoM = null;
        JTextField paramNombres = null;
        Paciente instance = new Paciente();
        instance.InsertarPaciente(paramApellidoP, paramApellidoM, paramNombres);
    }
    
}
