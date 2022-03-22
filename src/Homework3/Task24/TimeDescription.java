package Homework3.Task24;

public class TimeDescription {
    private static final int HOURS_D = 3600;
    private static final  int MIN_D = 60;
    private final long seconds;
    private final long minutes;
    private final long hours;
    private final long timeInSeconds;

    public TimeDescription(long hours, long minutes,long seconds)  {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        this.timeInSeconds = hours * HOURS_D + minutes * MIN_D + seconds;
    }

    public TimeDescription(long seconds) {
        long secondBalance = seconds;
        this.hours = seconds / HOURS_D;
        secondBalance -= this.hours * HOURS_D;
        this.minutes = secondBalance / MIN_D;
        secondBalance -= this.minutes * MIN_D;
        this.seconds = secondBalance;
        this.timeInSeconds = seconds;

    }

    public long getTimeInSeconds(){
        return this.timeInSeconds;
    }

    public long compareTo(TimeDescription anotherTimeDescription) {
        final long currentTimeInSeconds = this.getTimeInSeconds();
        final long anotherTimeInSeconds = anotherTimeDescription.getTimeInSeconds();
        if (currentTimeInSeconds > anotherTimeInSeconds){
            System.out.println(" First time less then Second time");
            return 1;
        } else if (currentTimeInSeconds < anotherTimeInSeconds) {
            System.out.println(" First time more then Second time ");
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "TimeDescription{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}