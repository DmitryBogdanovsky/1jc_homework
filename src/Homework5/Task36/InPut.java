package Homework5.Task36;

import java.util.Scanner;

public class InPut {
    public String inputSeason(){
        System.out.println("Enter the season of the year: ");
        System.out.println("For example: 1 — Winter, 2- Spring, 3 - Summer, 4 - Autumn");
        return new Scanner(System.in).next();
    }
}
