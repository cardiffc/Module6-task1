package Accounts;

import java.time.LocalDate;
public class DepAccount extends CurAccount {
    LocalDate depInDate;
    public DepAccount(double amount) {
        super(amount);
        depInDate = LocalDate.now();
    }
    public void setAmount(double amount)
    {
        this.amount += amount;
        depInDate = LocalDate.now();
    }
    public void wdAmount (double amount)
    {
         LocalDate wdDay = LocalDate.now();
        if (amount <= this.amount) {
            if ((wdDay.getMonth().compareTo(depInDate.getMonth()) >= 1)
                    && ((wdDay.getDayOfMonth() - depInDate.getDayOfMonth()) >= 0))
            {
                this.amount -= amount;
                getWdMessage(amount, this.amount);
            } else {
                System.out.println("Снятие денег с данного счета не возможно до " + depInDate.plusMonths(1) + " !");
            }
        } else
            {
                getNotEnouthMoneyMsg();
            }
        }
    }



