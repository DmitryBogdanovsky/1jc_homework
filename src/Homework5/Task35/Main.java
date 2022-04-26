package Homework5.Task35;

public class Main {
    public static void main(String[] args) {
        System.out.println("Season of the year : ");
        for (SeasonOfYear show : SeasonOfYear.values()) {
            System.out.println(show + ".    " + show.getDescriptions() + ". Days in the " + show + "  " + show.getCountOfDays());
        }
    }
}
