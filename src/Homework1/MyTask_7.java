package Homework1;

import java.util.Scanner;

public class MyTask_7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a : ");
        int a = in.nextInt();

        System.out.print("Input b: ");
        int b = in.nextInt();

        System.out.print("Input radius: ");
        int r = in.nextInt();

        in.close();

        int d;
        d = r * 2;

        if (d >= a && d >= b) {
            System.out.println("Circle closing rectangle");
        } else
            System.out.println("Circle isn't closing rectangle");

    }

}
