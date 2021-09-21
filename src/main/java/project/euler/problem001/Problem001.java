/*
 * https://projecteuler.net/problem=1
 *
 * Multiples of 3 or 5
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

package project.euler.problem001;

import static project.euler.util.Utils.ellapsedTime;

public class Problem001 {

    static long sum1(long limit) {
        long sum = 0;

        for (long i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    static long sum2(long limit) {
        return sum2(3, limit) + sum2(5, limit) - sum2(15, limit);
    }

    static long sum2(int div, long limit) {
        long sum = 0;

        for (long i = div; i < limit; i += div) {
            sum += i;
        }

        return sum;
    }

    static long sum3(long limit) {
        return sum3(3, limit) + sum3(5, limit) - sum3(15, limit);
    }

    static long sum3(int div, long limit) {
        long pairs = (limit - 1) / div;
        return div * ((pairs * (pairs + 1)) / 2);
    }

    public static void main(String[] args) {
        System.out.println("sum1 = " + sum1(1000));
        System.out.println("sum2 = " + sum2(1000));
        System.out.println("sum3 = " + sum3(1000));

        long[] limits = { 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };

        System.out.println("\nsum1:");
        for (long l : limits) {
            ellapsedTime(l, () -> sum1(l));
        }

        System.out.println("\nsum2:");
        for (long l : limits) {
            ellapsedTime(l, () -> sum2(l));
        }

        System.out.println("\nsum3:");
        for (long l : limits) {
            ellapsedTime(l, () -> sum3(l));
        }
    }

}
