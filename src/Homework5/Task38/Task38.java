package Homework5.Task38;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input car name: ");
        String nameOfCar = scanner.nextLine();
        System.out.println("Input motorcycle name: ");
        String nameOfMotorcycle = scanner.nextLine();

        Vehicle car = new Car(nameOfCar);
        Vehicle motorcycle = new Motorcycle(nameOfMotorcycle);

        Garage<Vehicle> garage = new Garage<>();
        garage.getArrayOfVehicle(car, motorcycle);
        garage.outputName();
    }
}
