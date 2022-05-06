package Homework6.Task41;

import Homework6.Tsak39.Input;
import Homework6.Tsak39.List;

public class Task41 {
    public static void main(String[] args) {
        List listOfMarks = new List();
        listOfMarks.fillList(new Input().input(": "));
        listOfMarks.showArrayList("Marks: ");
        System.out.println("Max mark is "+ listOfMarks.maxMarks());
    }
}
