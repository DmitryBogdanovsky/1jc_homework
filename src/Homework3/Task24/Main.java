package Homework3.Task24;

public class Main {

    public static void main(String[] args) {
        TimeDescription time1 = new TimeDescription(800);
        System.out.println("First time : " + time1);

        TimeDescription time2 = new TimeDescription(25,15, 26);
        System.out.println("Second time : " + time2);

        System.out.println("Compare result  :   " + time2.compareTo(time1));
    }
}
