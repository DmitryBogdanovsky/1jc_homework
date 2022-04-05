package Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {

    public static void main(String[] args) {
        StringInput stringInput = new StringInput();
        String line = stringInput.input();

        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }
    }
}
