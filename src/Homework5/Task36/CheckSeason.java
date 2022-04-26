package Homework5.Task36;

import Homework5.Task35.SeasonOfYear;

public class CheckSeason {
    public boolean checkInformation(String season){
        if (season.length() == 0) {
            System.out.println("Incorect input");
            //return false;
        }
        return true;
    }

    public SeasonOfYear checkSeason(String season){
        checkInformation(season);
        switch (season){
            case "1": return SeasonOfYear.WINTER;
            case "2": return SeasonOfYear.SPRING;
            case "3": return SeasonOfYear.SUMMER;
            case "4": return SeasonOfYear.AUTUMN;
            default:
                System.out.println("Error season");
                System.exit(1);
                return null;
        }
    }
}
