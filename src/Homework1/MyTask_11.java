package Homework1;

import java.util.Scanner;

public class MyTask_11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the days of the week : ");
        int day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println("1. Work");
                System.out.println("2. Going to the store");
                System.out.println("3. Study");
                break;
            case 2:
                System.out.println("1. Work");
                System.out.println("2. Lessons");
                System.out.print("3. Rest");
                break;
            case 3:
                System.out.println("1. Work");
                System.out.println("2. Sports activities");
                System.out.println("3. Study");
                break;
            case 4:
                System.out.println("1. Work");
                System.out.println("2. Lessons");
                System.out.println("3. Rest");
                break;
            case 5:
                System.out.println("1. Work");
                System.out.println("2. Walk");
                System.out.println("3. Study");
                break;
            case 6:
                System.out.println("1. Go to garage");
                System.out.println("2. Walk");
                System.out.println("3. Study");
                break;
            case 7:
                System.out.println("1. Rest");
                System.out.println("2. Walk");
                System.out.println("3. Study");
                break;
            default:
              System.out.println("The wrong number, in the week is only 7 days. Try again");

        }

    }


}
