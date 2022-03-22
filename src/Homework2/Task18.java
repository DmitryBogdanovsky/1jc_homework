package Homework2;

import java.util.Arrays;

public class Task18 {

    public static void main(String[] args) {
        int mass[] = new int[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        System.out.println("We create array: "+ "\n"+Arrays.toString(mass));
        System.out.println("Last digit im array : " + mass[mass.length - 1]);

    }
}
