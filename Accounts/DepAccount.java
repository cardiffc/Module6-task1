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
        super.setAmount(amount);
        depInDate = LocalDate.now();
    }
    public void wdAmount (double amount)
    {
        LocalDate wdDay = LocalDate.now();
        if ((wdDay.getMonth().compareTo(depInDate.getMonth()) >= 1)
                && ((wdDay.getDayOfMonth() - depInDate.getDayOfMonth()) >= 0))
        {
            super.wdAmount(amount);
        } else {
            System.out.println("Снятие денег с данного счета не возможно до " + depInDate.plusMonths(1) + " !");
        }
    }
}



