package Homework6.Task43;

public class Task43 {
    public static void main(String[] args) {
        Integer int1 = 1;
        Integer int2 = null;
        try {
            int int3 = int1 / int2;
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}
