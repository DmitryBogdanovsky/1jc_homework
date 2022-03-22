package Homework1;

import java.util.Scanner;

public class MyTask_9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день: ");
        int d = in.nextInt();
        System.out.println("Введите месяц: ");
        int m = in.nextInt();
        System.out.println("Введите год: ");
        int y = in.nextInt();

        System.out.println("Вы ввели дату: " + d + "-" + m + "-" + y);

        switch (m) {
            case 1:
                if (d == 31) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d <= 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 2:
                if (d >= 28) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                    return;
                } else
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                return;
            case 3:
                if (d == 31) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d <= 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 4:
                if (d == 30) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d < 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 5:
                if (d == 31) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d <= 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 6:
                if (d == 30) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d < 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 7:
                if (d == 31) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d <= 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 8:
                if (d == 31) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d == 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 9:
                if (d == 30) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d < 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 10:
                if (d == 31) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d <= 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 11:
                if (d == 30) {
                    d = 1;
                    m++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d < 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }
                return;
            case 12:
                if (d == 31) {
                    d = 1;
                    m = 1;
                    y++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                } else if (d <= 30) {
                    d++;
                    System.out.println("Следующая дата: " + d + "-" + m + "-" + y);
                }


        }

    }


}
