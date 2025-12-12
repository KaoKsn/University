// 5 - Method Overriding.
import java.util.Scanner;
abstract class Payments
{
    double amount;
    public Payments(double amount)
    {
        this.amount = amount;
    }
    abstract public boolean payment();
}

class UPI extends Payments
{
    int cut = 5;
    public UPI(double amount)
    {
        super(amount);
    }
    public boolean payment()
    {
        double netPayable = this.amount - 5;
        if (netPayable < 0)
            return false;
        System.out.println("Net: " + netPayable);
        return true;
    }
}

class CreditCard extends Payments
{
    double cut = 2.0;
    public CreditCard(double amount)
    {
        super(amount);
    }
    public boolean payment()
    {
        double netPayable = this.amount - this.amount * (cut/100);
        System.out.println("Net: " + netPayable);
        return true;
    }
}

class NetBank extends Payments
{
    double cut = 1.5;
    public NetBank(double amount)
    {
        super(amount);
    }
    public boolean payment()
    {
        double netPayable = this.amount - this.amount * (cut/100);
        System.out.println("Net: " + netPayable);
        return true;
    }
}

class paymentSystems
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double amount;
        int choice;
        System.out.print("Amount: ");
        amount = in.nextDouble();

        Payments mode;
        while(true) {
            System.out.println("\nMode");
            System.out.println("1.UPI");
            System.out.println("2.Credit Card");
            System.out.println("3.Net Banking");
            System.out.println("4.Cancel");
            choice = in.nextInt();

            switch(choice) {
                case 1:
                        mode = new UPI(amount);
                        mode.payment();
                        return;

                case 2:
                        mode = new CreditCard(amount);
                        mode.payment();
                        return;
                case 3:
                        mode = new NetBank(amount);
                        mode.payment();
                        return;
                case 4:
                        System.out.println("Payment Cancelled!\n");
                        return;
                default:
                        System.out.println("Invalid Choice!");
            }
        }
    }
}
