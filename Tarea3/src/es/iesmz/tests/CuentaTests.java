package es.iesmz.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CuentaTests {

    //Primer commit
    @Test
    void testIBANesperado1(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(true, C1.compruebaIBAN("ES6621000418401234567891"));
    }

    @Test
    void testIBANesperado2(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(true, C1.compruebaIBAN("ES6000491500051234567892"));
    }

    @Test
    void testIBANesperado3(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(true, C1.compruebaIBAN("ES9420805801101234567891"));
    }

    @Test
    void testIBANesperado4(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(false, C1.compruebaIBAN("ES7600246912501234567891"));
    }

    @Test
    void testIBANesperado5(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(false, C1.compruebaIBAN("ES4721000418401234567891"));
    }

    @Test
    void testIBANesperado6(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(false, C1.compruebaIBAN("ES8200491500051234567892"));
    }

    //Segundo commit
}
