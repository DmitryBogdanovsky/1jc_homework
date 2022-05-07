package Homework6.Task45;

import java.io.IOException;
import java.util.InputMismatchException;

public class Task45 {
    public static void main(String[] args) {
        ExpectionMethod expectionMethod = new ExpectionMethod();
        try{
            expectionMethod.expection();
        } catch (ArithmeticException | InputMismatchException | IOException e){
            e.printStackTrace();
            System.out.println("Break");
        }
    }
}
