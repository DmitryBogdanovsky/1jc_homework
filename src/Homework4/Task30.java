package Homework4;


import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {

        StringInput stringInput = new StringInput();
        String line = stringInput.input();
        System.out.println(line.replaceAll("<p id=p1>", "<p>"));
    }

}
