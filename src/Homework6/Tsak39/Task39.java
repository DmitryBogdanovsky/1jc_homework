package Homework6.Tsak39;

public class Task39 {
    public static void main(String[] args) {
        List listOfMarks = new List();
        listOfMarks.fillList(new Input().input("Input count of students: "));
        listOfMarks.showArrayList("Marks: ");
        listOfMarks.removeBadMarks();
        listOfMarks.showArrayList("Marks after remove: ");
    }
}
