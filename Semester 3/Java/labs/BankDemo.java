// 6 - Packages.
import java.util.Scanner;
import accounts.*;
import services.*;

class BankDemo
{
    static {
          System.out.println("== BANK DEMO ==\nStart by creating an account!");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name;
        double amount;
        System.out.print("Name: ");
        name = in.nextLine();

        Account account = new Account(name);

        System.out.print("\nDeposit: ");
        amount = in.nextDouble();
        account.deposit(amount);

        System.out.print("\nWithdraw: ");
        amount = in.nextDouble();
        account.withdraw(amount);

        System.out.println("\nCredit @8.5%");
        Interest interest = new Interest();
        interest.interestCal(account);

        account.accInfo();
    }
}
