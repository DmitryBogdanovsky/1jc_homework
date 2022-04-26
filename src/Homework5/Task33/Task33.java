package Homework5.Task33;

public class Task33 {

    public static void main(String[] args) {
        PlasticCard plasticCard = new PlasticCard("Alfa-Bank", "4444 7777 8888 9999",
                "BELCARD", "111", "5555", "IVANOV");
        plasticCard.getInfoCard();
    }

}

class BankCard {
    private final String nameOfBank;

    public BankCard(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

}

class DebitCard extends BankCard {
    private final String idNumber;
    private final String typeCard;
    private final String codCvC;

    public DebitCard(String nameOfBank, String idNumber, String typeCard, String codCvC) {
        super(nameOfBank);
        this.idNumber = idNumber;
        this.typeCard = typeCard;
        this.codCvC = codCvC;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public String getCodCvC() {
        return codCvC;
    }

}

class PlasticCard extends DebitCard {
    private final String nameOwner;

    public PlasticCard(String nameOfBank, String idNumber, String typeCard, String codCvC, String nameOwner, String ivanov) {
        super(nameOfBank, idNumber, typeCard, codCvC);
        this.nameOwner = nameOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void getInfoCard() {
        System.out.println("Bank: " + getNameOfBank());
        System.out.println("Id number: " + getIdNumber());
        System.out.println("Type card: " + getTypeCard());
        System.out.println("Code cvc: " + getCodCvC());
        System.out.println("Name of owner: " + getNameOwner());

    }
}
