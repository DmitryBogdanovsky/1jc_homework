package Homework1;

import java.util.Scanner;

public class MyTask_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size A: ");
        int a = in.nextInt();

        System.out.print("Enter size B: ");
        int b = in.nextInt();

        System.out.print("Enter size C: ");
        int c = in.nextInt();

        System.out.print("Enter size D: ");
        int d = in.nextInt();

        System.out.print("Enter size E: ");
        int e = in.nextInt();

        System.out.print("Enter size F: ");
        int f = in.nextInt();

        if (a<=e && c<=e && b+d<=f){
            if (a<=e && d<=e && b+c<=f){
                if (d<=e && b<=e && c+a<=f) {
                    if (d<=e && a<=e && c+b<=f)

            System.out.println("Размещаются два дома на участке");
        }}} else
            System.out.println("Два дома не размещаются на участке");
    }


}

