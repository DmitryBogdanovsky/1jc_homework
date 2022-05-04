package Homework5.Task34;

public class Task34 {
    public static void main(String[] args) {
        Director director = new Director(20, 100, 1500000);
        director.getDayOfWork();
        director.aboutDohod();

        Director topManager = new TopManager(15,0, director.prib);
        topManager.getDayOfWork();
        topManager.aboutDohod();

        Director driver = new Driver(30,20, director.prib);
        driver.getDayOfWork();
        driver.aboutDohod();


    }
}
