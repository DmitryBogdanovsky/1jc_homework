package Homework1;

public class MyTask_4 {

    int sum;

    public int getInt(int a, int b) {
        sum = a + b + (a * b);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MyTask_4().getInt(555, 777));

    }

}
