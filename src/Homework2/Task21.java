package Homework2;

import java.util.Arrays;

public class Task21 {

    public static void main(String[] args) {

        //int[] array = new int[]{10, 2, 3, 4, 6, 120, 120, 80, 9, 1};
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 1);
        }
        System.out.println("We create array: " + "\n" + Arrays.toString(array));
        //   Method getMaxValue Index
        int max = getMax(array);
        System.out.println("Maximum Value Index is: " + max);
        // Method getMinValue Index
        int min = getMin(array);
        System.out.println("Minimum Value Index is: " + min);
        System.out.println("Summ Number MaxIndex and MinIndex = " + sum(array));

    }

    // Method calculate sum array MinIndex to MaxIndex
    public static int sum(int[] array) {
        int sum = 0;
        int min = getMin(array);
        int max = getMax(array);
        if (min < max && (max - min) != 1) {
            for (int i = min + 1; i < max; i++)
                sum += array[i];
            return sum;
        }
        if (max < min && (min - max) != 1) {
            for (int i = max + 1; i < min; i++)
                sum += array[i];
            return sum;
        }
        return sum;
    }

    //MAX index
    public static int getMax(int[] inputArray) {
        int maxIndex = 0;
        int maxValue = inputArray[maxIndex];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] >= maxValue) {
                maxValue = inputArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Min Index
    public static int getMin(int[] inputArray) {
        int minIndex = 0;
        int minValue = inputArray[minIndex];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}

