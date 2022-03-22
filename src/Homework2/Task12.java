package Homework2;

public class Task12 {

    public static void main(String[] args) {

        calcFactor();

    }

    public static void calcFactor() {

        int countLow = 0;
        int countHigh = 10;
        int value = 1;

        while (countLow <= countHigh) {
            if (countLow == 0) {
                value = value * (countLow + 1);
            } else {
                value = value * countLow;
            }
            countLow++;
            System.out.println("Factorial of " + (countLow - 1) + " is " + value);

        }

    }
}