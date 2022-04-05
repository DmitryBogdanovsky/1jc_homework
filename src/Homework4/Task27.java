package Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {

    public static void main(String[] args) {

        StringInput stringInput = new StringInput();
        String line = stringInput.input();
        int words = 0;
        Pattern wordsPattern = Pattern.compile("(?U)[^\\W_]+");
        Matcher matcherWords = wordsPattern.matcher(line);
        while (matcherWords.find()) {
            words++;
        }
        System.out.println("Number of words in line " + words);
    }
}
