package Homework2;

public class Task16 {

    public static void main(String[] args) {

        String name = "Hope!";

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i + ": " + " " + name);
            }
            else
                System.out.println(i);
        }
    }

}
