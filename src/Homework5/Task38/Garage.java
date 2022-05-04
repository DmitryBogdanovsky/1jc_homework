package Homework5.Task38;

import java.util.Arrays;

public class Garage <T extends Vehicle>{
    private String nameOfCar;
    private String nameOfMotorcycle;

    Vehicle[] vehicle = new Vehicle[2];

    public void getArrayOfVehicle(T car, T motorcycle ){

        for(int i = 0; i < vehicle.length; i ++){
            if(i == 0) vehicle[i] = car;
            else vehicle[i] = motorcycle;
        }
    }

    private void setName(){

        for(int i = 0; i < vehicle.length; i ++){
            if(i == 0) nameOfCar = vehicle[i].getName();
            else nameOfMotorcycle = vehicle[i].getName();
        }
    }


  public void outputName(){

        setName();
        System.out.println("In garage Car's model : " + nameOfCar);
        System.out.println("In garage Motorcycle's model : " + nameOfMotorcycle);

    }
}
