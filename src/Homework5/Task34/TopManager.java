package Homework5.Task34;

public class TopManager extends Director {
    private final String dolgnost = "Топ мэнеджер";

    @Override
    public String getDolgnost() {
        return dolgnost;
    }

    public TopManager(int dayOfWork, double dohod,double prib) {
        super(dayOfWork, dohod, prib);
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
        System.out.println("Прибыль " + prib + "   Процент дохода = 1,5%");
        System.out.println("Зарплата процентная: " + ((prib * 0.5) + prib) + dohod);
    }
}
