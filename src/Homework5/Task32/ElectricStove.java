package Homework5.Task32;

 class ElectricStove extends Appliances {
    private final String name;

    public ElectricStove(String name) {
        this.name = name;
    }

     @Override
     public void condition() {
         System.out.println(this.name + " Status ON");
     }
 }
 class Microwave extends Appliances{
     private final String name;

     public Microwave(String name) {
         this.name = name;
     }

     @Override
     public void condition() {
         System.out.println(this.name + " Status OFF");
     }
 }
class ElectricKettle extends Appliances{
     private final String name;

    public ElectricKettle(String name){
        this.name = name;
    }

    @Override
    public void condition() {
        System.out.println(this.name + " Status OFF");
    }
}