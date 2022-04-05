package Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Input text : " );
        String line = in.nextLine();

        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }
    }
}
