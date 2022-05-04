package Homework5.Task34;

public class Director {
    final int dayOfWork;
    public final double dohod;
    public final double prib;

    private final String dolgnost = "Директор";

    public String getDolgnost() {
        return dolgnost;
    }

    public Director(int dayOfWork, double dohod, double prib){
        this.dayOfWork = dayOfWork;
        this.dohod = dohod;
        this.prib = prib;
    }

    public void getDayOfWork(){
        System.out.println(getDolgnost());
        System.out.println("Количество рабочих дней : " + dayOfWork);
    }

    public void aboutDohod(){
        dohod();
        getDohod();
        System.out.println();
    }

    private void dohod(){
      //  System.out.println("Оклад = " + dohod + "  рублей");
        System.out.print("Зарплата за " + dayOfWork + "  дней     ");
    }

    public void getDohod() {
        System.out.println("Оклад = " + dohod );
        System.out.println("Зарплата почасовая: " + ((dohod*8) * dayOfWork));

    }
}