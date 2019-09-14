package Accounts;

import java.util.Calendar;
import java.util.Date;

public class DepAccount extends CurAccount {
    Calendar depDay = Calendar.getInstance();
    public DepAccount(double amount) {
        super(amount);
        Date today = new Date();
        depDay.set(today.getYear(), today.getMonth(), today.getDate());
    }
    public void setAmount(double amount)
    {
        this.amount = this.amount + amount;
        Date newDate = new Date();
        depDay.set(newDate.getYear(), newDate.getMonth(), newDate.getDate());
    }
    public void wdAmount (double amount)
    {
        Date wdDate = new Date();
        if (amount <= this.amount) {
            if (wdDate.getYear() >= depDay.get(Calendar.YEAR) && wdDate.getMonth() >= (depDay.get(Calendar.MONTH) + 1)
                    && wdDate.getDate() >= (depDay.get(Calendar.DAY_OF_MONTH) + 1)) {
                this.amount = this.amount - amount;
                getWdMessage(amount, this.amount);
            } else {
                System.out.println("Вы пока не можете снять денег с депозита!!!");
            }
        } else
            {
                getNotEnouthMoneyMsg();
            }
        }
    }



