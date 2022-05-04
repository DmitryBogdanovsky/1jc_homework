package Homework5.Task34;

public class Driver extends TopManager {
    private String dolgnost = "Водитель";

    @Override
    public String getDolgnost() {
        return dolgnost;
    }

    public Driver(int dayOfWork, double dohod, double prib) {
        super(dayOfWork, dohod, prib);
        this.dolgnost = dolgnost;
    }

   @Override
    public void getDayOfWork() {
        super.getDayOfWork();
    }

    @Override
    public void aboutDohod() {
        super.aboutDohod();
    }

    @Override
    public void getDohod() {
        System.out.println("Оклад = " + dohod + "   Процентовка = 0,003%");
        System.out.println("Зарплата процентно-почасовая: " + (((prib * 0.01)+ prib) + (dohod * dayOfWork)));
    }
}
