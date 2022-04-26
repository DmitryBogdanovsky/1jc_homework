package Homework5.Task32;

public class Main {

    public static void main(String[] args) {
        Appliances appl1 = new ElectricStove("ElectricStove");
        appl1.condition();

        Appliances appl2 = new ElectricKettle("ElectricKettle");
        appl2.condition();

        Appliances appl3 = new Microwave("Microwave");
        appl3.condition();

    }
}
