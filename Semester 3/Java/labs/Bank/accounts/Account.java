package accounts;

public class Account
{
    public static final int initBalance = 1000;
    protected static int acGen;
    protected String name, accNum;
    public double balance;

    public Account(String name)
    {
        this.name = name;
        this.accNum = "User" + acGen++;
        this.balance = initBalance;
    }
    public boolean withdraw(double amount)
    {
        if (amount > balance) {
            System.out.println("Not enough balance!");
            return false;
        }
        this.balance -= amount;
        System.out.println("Balance: " + this.getBalance());
        return true;
    }
    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println("Balance: " + this.getBalance());
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void accInfo()
    {
        System.out.println("\n== ACCOUNT INFO ==");
        System.out.println("Holder Name: " + this.name);
        System.out.println("Account Number: " + this.accNum);
        System.out.println("Balance: " + this.balance);
    }
}
