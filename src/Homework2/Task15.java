package Homework2;

public class Task15 {
    public static void main(String[] args) {

        boolean second = false;
        for (int a = 50; a <= 70; a++) {
            boolean b = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                if (second) {
                    System.out.println(a);
                    break;
                }
                second = true;
            }
        }

    }

}
