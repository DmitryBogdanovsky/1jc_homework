package Homework5.Task35;

public enum SeasonOfYear {
    WINTER(1,"Snowy     ", 90),
    SPRING(2,"Beautiful ", 92),
    SUMMER(3,"Hot       ", 92),
    AUTUMN(4,"Rainy     ", 91);

    private final int numberOfSeason;
    private final String descriptions;
    private final int countOfDays;


    SeasonOfYear(int numberOfSeason, String descriptions, int countOfDays) {
        this.numberOfSeason = numberOfSeason;
        this.descriptions = descriptions;
        this.countOfDays = countOfDays;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}

