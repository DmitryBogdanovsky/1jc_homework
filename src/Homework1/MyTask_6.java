package Homework1;

public class MyTask_6 {

    int num;

    public boolean getBoolean(int num) {
        this.num = num % 10;
        return this.num == 7;

    }

    public static void main(String[] args) {

        System.out.println(new MyTask_6().getBoolean(1256));

    }


}
