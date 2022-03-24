package Homework3.Task25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Money money = putMoney();
        Bankomat bankomat = new Bankomat(money.hundred, money.fifty, money.twenty);
        while (true) {

            System.out.print("Input value : ");
            int value = in.nextInt();
            System.out.println(bankomat.getMoney(value));
            System.out.println(bankomat);
            checkExitOrContinue();

        }
    }

    private static Money putMoney() {

        Scanner in = new Scanner(System.in);

        System.out.print("Input 20 : ");
        int twenty = in.nextInt();
        System.out.print("Input 50: ");
        int fifty = in.nextInt();
        System.out.print("Input 100: ");
        int hundred = in.nextInt();
        return new Money(hundred, fifty, twenty);

    }

    private static void checkExitOrContinue() {

        System.out.print("Please enter [E] to exit or any key to continue: ");
        String command = new Scanner(System.in).next();
        if (command.equalsIgnoreCase("E")) {
            System.exit(0);
        }

    }

}
