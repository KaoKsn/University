package services;

import accounts.*;

public class Interest
{
    float roi = 8.5f;
    public boolean interestCal(Account account)
    {
        double interest = account.balance * (roi/100);
        if (account.balance - interest < 100) {
            System.out.println("You can't pay your interest(Balance < 100). Deposit Now!");
            return false;
        }
        account.balance -= interest;
        System.out.println("Balance: " + account.getBalance());
        return true;
    }
}
