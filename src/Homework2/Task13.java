package Homework2;

import java.math.BigInteger;

public class Task13 {

    public static void main(String[] args) {

        System.out.println("The product of numbers from 1 to 25 = " + factorial(25));
    }

    public static BigInteger factorial(int f) {

        int i = 1;
        BigInteger result = BigInteger.ONE;

        do {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        }

        while (i <= f);

        return result;
    }
}