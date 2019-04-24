package org.esurovskiy;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

public class BigDecimalExample {
    public static void main(String[] args) {
        final BigDecimal a = new BigDecimal(1);
        final BigDecimal b = new BigDecimal(3);
        System.out.println(1.0 / 3.0);
        System.out.println(a.divide(b, BigDecimal.ROUND_HALF_UP));
        System.out.println(a.divide(b, MathContext.DECIMAL64));
//        System.out.println(a.divide(b, MathContext.UNLIMITED));

        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.err.println(random.nextInt(10));
        }
    }
}
