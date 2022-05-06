package Homework6.Task45;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Expectionethod {
    public int expection() throws IOException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");

        int i = scanner.nextInt();

        return i/0;
    }
}
