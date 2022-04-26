package Homework5.Task36;

import Homework5.Task35.SeasonOfYear;

public class Main {
    public static void main(String[] args) {
        showNextSeason();
    }
    public static void showNextSeason(){
        SeasonOfYear seasonsYear = new CheckSeason().checkSeason(new InPut().inputSeason());
        System.out.println("Next season: ");
        if (seasonsYear.ordinal() == SeasonOfYear.values().length - 1)
            System.out.println(SeasonOfYear.values()[0]);
        else
            System.out.println(SeasonOfYear.values()[seasonsYear.ordinal() + 1]);
    }
}
