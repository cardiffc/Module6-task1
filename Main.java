import Accounts.CreditAccount;
import Accounts.CurAccount;
import Accounts.DepAccount;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurAccount curMoney = new CurAccount(0.);
        DepAccount depMoney = new DepAccount(0.);
        CreditAccount creditMoney = new CreditAccount(0.);
        while (true) {
            System.out.println("Выберите операцию:\n1 - Посмотреть баланс\n2 - Внести деньги\n3 - Получить деньги\n ");
            Scanner scanner = new Scanner(System.in);
            String operChoice = scanner.nextLine();
            if (!checkInput(operChoice))
            {
                inputErrorMsg();
                continue;
            }
            System.out.println("Выберите счет:\n1 - Текущий\n2 - Депозитарный\n3 - Кредитный\n");
            String accountChoice = scanner.nextLine();
            if (!checkInput(accountChoice))
            {
                inputErrorMsg();
                continue;
            }
            switch (operChoice) {
                case ("1"):
                    if (accountChoice.equals("1")) {
                        getAmountMsg(curMoney.getAmount());
                    } else if (accountChoice.equals("2")) {
                        getAmountMsg(depMoney.getAmount());

                    } else {
                        getAmountMsg(creditMoney.getAmount());

                    }
                    break;
                case ("2"):
                    System.out.println("Введите сумму: ");
                    String inAmountStr = scanner.nextLine();
                    if (!inAmountStr.matches("\\d+"))
                    {
                        inputErrorMsg();
                        continue;
                    }
                    Double inAmount = Double.parseDouble(inAmountStr);
                    if (accountChoice.equals("1")) {
                        curMoney.setAmount(inAmount);
                    } else if (accountChoice.equals("2")) {
                        depMoney.setAmount(inAmount);
                    } else {
                        creditMoney.setAmount(inAmount);
                    }
                    break;
                case ("3"):
                    System.out.println("Введите сумму: ");
                    double wdAmount = scanner.nextDouble();
                    if (accountChoice.equals("1")) {
                        curMoney.wdAmount(wdAmount);
                    } else if (accountChoice.equals("2")) {
                        depMoney.wdAmount(wdAmount);
                    } else {
                        creditMoney.wdAmount(wdAmount);
                    }
                    break;

            }
        }
    }
    private static boolean checkInput (String input)
    {
        return input.matches("^(1|2|3)$");

    }
    private static void inputErrorMsg ()
    {
        System.out.println("Вы ввели недопустимое значение!");

    }
    private static void getAmountMsg (double amount)
    {
        System.out.println("На вашем счете " + amount + " рублей");
    }

}