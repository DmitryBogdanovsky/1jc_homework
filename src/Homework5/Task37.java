package Homework5;

import Homework5.Task35.SeasonOfYear;
import Homework5.Task36.CheckSeason;
import Homework5.Task36.InPut;

public class Task37 {
    public static void main(String[] args) {
        CountOfDays();
    }

    public static void CountOfDays(){
        SeasonOfYear seasons = new CheckSeason().checkSeason(new InPut().inputSeason());
        System.out.println("Count of days in  "+ seasons + " — " + seasons.getCountOfDays());
    }
}
