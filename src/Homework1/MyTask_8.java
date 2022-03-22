package Homework1;

import java.util.Scanner;

public class MyTask_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько у Вас денег в рублях: ");
        int x = in.nextInt();

        if (x % 10 == 0)
            System.out.println("Вы имеете " + x + " рублей");
        else if (x % 10 == 1)
            System.out.println("Вы имеете: " + x + " рубль");
        else if (x % 10 <= 4 && x % 10 > 1)
            System.out.println("Вы имеете: " + x + " рубля");
        else if (x % 10 > 4)
            System.out.println("Вы имеете: " + x + " рублей");

    }


}
