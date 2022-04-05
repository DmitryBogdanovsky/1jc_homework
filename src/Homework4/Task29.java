package Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {

    public static void main(String[] args) {
        StringInput stringInput = new StringInput();
        String line = stringInput.input();

        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(line);
        System.out.println("Places where hexadecimal numbers are found: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());

        }

    }


}
