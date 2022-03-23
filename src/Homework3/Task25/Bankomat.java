package Homework3.Task25;

public class Bankomat {
    private int twenty;
    private int fifty;
    private int hundred;

    public Bankomat(int hundred, int fifty, int twenty) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }


    public boolean getMoney(int value){
        if (value % 20 != 0 && value % 50 != 0){
            return false;
        }

        int hundredCount = value / 100;
        int fiftyCount = 0;
        int twentyCount = 0;
        if ( hundredCount > this.hundred ){
            hundredCount = this.hundred;
        }
        value -= hundredCount * 100;
        if (value % 100 == 0){
            fiftyCount = value / 50;
            if (fiftyCount > this.fifty ){
                int temp = this.fifty / 2;
                fiftyCount = temp * 2;
            }
            value -= fiftyCount * 50;
        }
        else  if(value % 50 == 0){
            fiftyCount = value / 50;
            if (fiftyCount > this.fifty){
                fiftyCount = this.fifty;
                if (fiftyCount % 2 == 0) {
                    fiftyCount --;
                }
            }
            value -= fiftyCount * 50;
        }

        if(value % 20 == 0){
            twentyCount = value / 20;
            if (twentyCount > this.twenty){
                return false;
            }
            value -= twentyCount * 20;
        }

        boolean result = value == 0;
        if (result) {
            this.twenty -= twentyCount;
            this.fifty -= fiftyCount;
            this.hundred -= hundredCount;
            System.out.println("100 : " + hundredCount);
            System.out.println("50 : " + fiftyCount);
            System.out.println("20 :" + twentyCount);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Bankomat Balance:{"  +
                " 100 = " + hundred +
                ", 50 = " + fifty +
                ", 20 = " + twenty +
                '}';
    }
}
