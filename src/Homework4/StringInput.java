package Homework4;

import java.util.Scanner;

public class StringInput {
    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        return scanner.nextLine();
    }
}