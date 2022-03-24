package Homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Input text with { . ,?!<> ect.  :");
        String line = in.nextLine();
        int punto = 0;
        Pattern puntoPattern = Pattern.compile("[\\p{P}\\p{S}]");
        Matcher matcherPunto = puntoPattern.matcher(line);
        while (matcherPunto.find()){
            punto++;
        }


        System.out.println("Number of punctuation characters in line " + punto);
    }
}


