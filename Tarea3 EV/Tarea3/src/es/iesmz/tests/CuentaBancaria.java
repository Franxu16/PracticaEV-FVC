package es.iesmz.tests;

import java.math.BigInteger;

public class CuentaBancaria {

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


    public String generaIBAN(String entidad, String oficina, String dc, String cuenta){
        BigInteger N;
        String C = entidad + oficina + dc + cuenta;
        if(C.length() != 20) return null;
        N = new BigInteger(entidad + oficina + dc + cuenta + "142800");
        BigInteger R = N.mod(new BigInteger("97"));
        String C2 = String.valueOf(98-R.intValue());

        return "ES" + C2 + C;
    }
}
