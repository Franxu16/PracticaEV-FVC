package es.iesmz.tests;

import java.math.BigInteger;

public class CuentaBancaria {

    /*public String generalIBAN(String entidad, String oficina, String dc, String cuenta){

    }*/

    public boolean compruebaIBAN(String IBAN){
        boolean P = false, D = false;
        if(IBAN.substring(0,2).equalsIgnoreCase("ES")) P = true;
            BigInteger A = new BigInteger(IBAN.substring(4) + "142800");
            BigInteger B = A.mod(BigInteger.valueOf(97));
            BigInteger B1 = new BigInteger("97");

            BigInteger C = B.mod(B1);

            if(98-C.intValue() == Integer.parseInt(IBAN.substring(2,4))) D = true;

            return P && D;
    }
}
