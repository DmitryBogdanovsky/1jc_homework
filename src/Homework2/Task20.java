package Homework2;

import java.util.Arrays;

public class Task20 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println("We create array: " + "\n" + Arrays.toString(array));
        System.out.println("Max number in array: " + array[IndexMax(array)] + "  have index : " + IndexMax(array));
    }

    private static int IndexMax(int[] mass) {
        int maxIndex = 0;
        int max = mass[maxIndex];
        for (int i = 0; i < mass.length; i++)
            if (mass[i] > max) {
                max = mass[i];
                maxIndex = i;
            }

        return maxIndex;
    }
}




