package Accounts;

public class CreditAccount extends CurAccount {
    private static final int COMMISSION = 1;

    public CreditAccount(double amount) {
        super(amount);
    }

    public void wdAmount (double amount)
    {
        if ((amount + (amount / 100) * COMMISSION) <= this.amount)
        {
            this.amount -= (amount - (amount / 100) * COMMISSION);
            getWdMessage(amount, this.amount);
        } else
        {
            getNotEnouthMoneyMsg();
        }


    }

}
