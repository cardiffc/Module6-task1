package Accounts;

public class CreditAccount extends CurAccount {
    private final int COMMISSION = 1;

    public CreditAccount(double amount) {
        super(amount);
    }

    public void wdAmount (double amount)
    {
        super.wdAmount(amount + (amount /100) * COMMISSION);
    }
}
