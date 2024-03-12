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
    @Test
    void testGeneraIBAN1(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals("ES7100302053091234567895", C1.generaIBAN("0030","2053","09", "1234567895"));
    }
    @Test
    void testGeneraIBAN2(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals("ES1720852066623456789011", C1.generaIBAN("0049","2352","08", "2414205416"));
    }@Test
    void testGeneraIBAN3(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals("ES1720852066623456789011", C1.generaIBAN("2085”","2066","62", "3456789011"));

    }@Test
    void testGeneraIBAN4(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(null, C1.generaIBAN("2085","2066","62", "3456AE9011"));
    }@Test
    void testGeneraIBAN5(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(null, C1.generaIBAN("208","2066","62", "3456789011"));

    }@Test
    void testGeneraIBAN6(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(null, C1.generaIBAN("2080","20A6","62", "3456789011"));
    }@Test
    void testGeneraIBAN7(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(null, C1.generaIBAN("2080","2086","6", "3456789011"));
    }@Test
    void testGeneraIBAN8(){
        CuentaBancaria C1 = new CuentaBancaria();
        assertEquals(null, C1.generaIBAN("0030","2053","63", "345678911"));
    }






}
