package org.esurovskiy;

import java.math.BigInteger;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class MathExample {
    public static void main(String[] args) {

        final BigInteger bigInteger =
                new BigInteger("1212908392920000000000000000000000");
        final BigInteger divided = bigInteger
                .divide(new BigInteger("1000000000000000"));
        System.out.println(divided);
        final BigInteger max = bigInteger.max(divided);
        System.out.println(max);
        final BigInteger bigInteger1 =
                new BigInteger("1000000000000000000000");
        long a = bigInteger1.longValue();
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);
    }
}
