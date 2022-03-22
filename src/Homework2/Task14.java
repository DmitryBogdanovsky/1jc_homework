package Homework2;

public class Task14 {
    public static void main(String[] args) {

        long n = 7893823445L;
        System.out.println("We have number: " + n);
        System.out.println("The sum of the digits is: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        }
        while (n != 0);
        return sum;

    }


}
