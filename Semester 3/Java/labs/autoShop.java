import java.util.Scanner;
class Car
{
    double regularPrice = 800000;
    int speed;
    String color;
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
    public double getSalePrice()
    {
        return regularPrice;
    }
}
class Truck extends Car
{
    double regularPrice = 1500000;
    int weight;
    Truck (int weight, String color, int speed)
    {
        this.weight = weight;
        super(color, speed);
    }
    // If the weight > 2000kg, 10% discount, else 20%.
    public double getSalePrice(int weight, String color, int speed)
    {
        double finalSalePrice;
        if (this.weight > 2000)
            finalSalePrice = regularPrice - (regularPrice * 0.1);
        else
            finalSalePrice = regularPrice - (regularPrice * 0.2);
        return finalSalePrice;
    }
}
class Ford extends Car
{
    double regularPrice = 1000000;
    static int manufacturerDiscount = 10000;
    int year;
    Ford (int year, String color, int speed)
    {
        this.year = year;
        super(color, speed);
    }
    public double getSalePrice()
    {
        return regularPrice - manufacturerDiscount;
    }
}
class Sedan extends Car
{
    double regularPrice = 2000000;
    int length;
    Sedan (int length, String color, int speed)
    {
        this.length = length;
        super(color, speed);
    }
    public double getSalePrice()
    {
        double finalSalePrice;
        if (this.length > 20)
            finalSalePrice = regularPrice - (regularPrice * 0.05);
        else
            finalSalePrice = regularPrice - (regularPrice * 0.1);
        return finalSalePrice;
    }
}
class autoShop
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("== A CAR ==");
        System.out.print("Color: ");
        String color = in.nextLine();
        System.out.print("Speed: ");
        int speed = in.nextInt();
        in.nextLine();
        Car car = new Car(color, speed);
        System.out.println("Final Sale Price of the Car: " + car.getSalePrice());

        // *** Sedan
        System.out.println("\n== SEDAN ==");
        System.out.print("Color: ");
        color = in.nextLine();
        System.out.print("Speed: ");
        speed = in.nextInt();
        System.out.print("Length: ");
        int length = in.nextInt();
        in.nextLine();
        car = new Sedan(length, color, speed);
        System.out.println("Final Sale Price of Sedan: " + car.getSalePrice());

        // *** Ford
        System.out.println("\n== FORD ==");
        System.out.print("Color: ");
        color = in.nextLine();
        System.out.print("Speed: ");
        speed = in.nextInt();
        System.out.print("Year: ");
        int year = in.nextInt();
        in.nextLine();
        car = new Ford(year, color, speed);
        System.out.println("Final Sale Price of Ford: " + car.getSalePrice());
        return;
    }
}
