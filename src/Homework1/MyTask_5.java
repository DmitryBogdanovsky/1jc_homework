package Homework1;

import javax.swing.*;

public class MyTask_5 {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter the interval in seconds: ");
        int s = Integer.parseInt(input);

        int sec, m, min, h, d, w;

        h = s / 3600;
        min = (s - h * 3600) / 60;
        sec = s - h * 3600 - min * 60;
        d = h / 24;
        w = d / 7;

        System.out.println("In "+ s + " seconds: ");
        System.out.println("This is : " + h + " hours, " + min + " minutes, " + sec +
                " seconds, " + d + " days, " + w + " weeks.");

        System.exit(0);

    }

}
