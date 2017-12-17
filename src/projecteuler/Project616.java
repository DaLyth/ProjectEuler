package projecteuler;

import java.math.BigInteger;
import java.util.LinkedHashSet;
import static projecteuler.Project003.isPrime;

public class Project616 {
    
    /**
     * 
     * The logic is that creative numbers are of the form p^q where either
     * p or q are composite. But p^q cannot give 16, which is the only exception
     * 
    **/
    
    
    
    // Thanks to Juan Lopez from stackoverflow for providing this neat little
    // prime checker for bigInts because I didn't have the energy to write it
    // myself at 4AM
    public static boolean returnPrime(BigInteger number) {
        //check via BigInteger.isProbablePrime(certainty)
        if (!number.isProbablePrime(5)) {
            return false;
        }

        //check if even
        BigInteger two = new BigInteger("2");
        if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two))) {
            return false;
        }

        //find divisor if any from 3 to 'number'
        for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(number) < 1; i = i.add(two)) { //start from 3, 5, etc. the odd number, and look for a divisor if any
            if (BigInteger.ZERO.equals(number.mod(i))) //check if 'i' is divisor of 'number'
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BigInteger base = new BigInteger("2");
        int exponent = 2;
        BigInteger tenToTheTwelve = (BigInteger.TEN).pow(12);
        LinkedHashSet<BigInteger> solution = new LinkedHashSet<>();
        while((base.pow(exponent).compareTo(tenToTheTwelve) <= 0)) {
            while((base.pow(exponent).compareTo(tenToTheTwelve) <= 0)) {
                if((base.equals(new BigInteger("2")) && exponent == 4) || (base.equals(new BigInteger("4")) && exponent == 2)) {
                    exponent++;
                    continue;
                }
                if(!returnPrime(base) || !isPrime(exponent)) {
                    solution.add(base.pow(exponent));
                }
                exponent++;
            }
            exponent = 2;
            base = base.add(BigInteger.ONE);
        }
        BigInteger result = BigInteger.ZERO;
        for(BigInteger l: solution) {
            result = result.add(l);
        }
        System.out.println("Result: " + result);
    }
}
