package Homework2;

import java.util.Arrays;

public class Task19 {

    public static void main(String[] args) {

        int[] array = {10, 20, 15, 18, 21, 8, 7, 6, 4, 3};
        System.out.println("We create array: "+ "\n"+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println("Even index " + i + ": " + array[i]);

            }
        }
    }

}

