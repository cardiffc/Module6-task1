package Accounts;

public class CurAccount {
    public double amount;

    public CurAccount(double amount) {
        this.amount = amount;
    }


    public double getAmount() { // показать баланс
        return amount;
    }

    public void setAmount(double amount) { // Положить денег
        this.amount += amount;
    }

    public void wdAmount(double amount) //Снять денег
    {
        if (amount <= this.amount) {
            this.amount -= amount;
            getWdMessage(amount, this.amount);
        }
        else {
            getNotEnouthMoneyMsg();
        }
    }
    public void getWdMessage (double amount, double last)
    {
        System.out.println("Вы сняли: " + amount + " рублей" + " Остаток на счете: " + last + " рублей");
    }
    public void getNotEnouthMoneyMsg ()
    {
        System.out.println("Недостаточно средств на счете!");
    }
}
