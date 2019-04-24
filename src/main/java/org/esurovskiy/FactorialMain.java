package org.esurovskiy;


import java.math.BigInteger;

public class FactorialMain {
    public static void main(String[] args) {
        System.out.println(factorial(21));
        System.out.println(longFactorial(21));

    }

    private static BigInteger factorial(final int n) {
        BigInteger result = new BigInteger("1");
        for (Integer i = 1; i <= n; i++) {
            final BigInteger a = new BigInteger(i.toString());
            result = result.multiply(a);
        }
        return result;
    }

    private static long longFactorial(final int n) {
        long result = 1;
        for (Integer i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
