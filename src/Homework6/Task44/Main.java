package Homework6.Task44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScanException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        while(true) {
            int x = scanner.nextInt();

            if(x!=0) {
                throw new ScanException("You enter only ZERO");
            }
        }
    }
}
