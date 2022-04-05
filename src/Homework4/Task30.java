package Homework4;


import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Input string : ");
        String line = in.nextLine();
        System.out.println(line.replaceAll("<p id=p1>", "<p>"));
    }

}
