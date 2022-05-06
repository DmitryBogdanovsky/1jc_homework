package Homework6.Task40;

import Homework6.Tsak39.Input;
import Homework6.Tsak39.List;

public class Task40 {
    public static void main(String[] args) {
        List list = new List();
        list.fillList(new Input().input("Input count of numbers: "));
        list.showArrayList("List: ");
        list.removeRepeatNumbers();
        list.showArrayList("List after remove repeat numbers: ");
    }
}
