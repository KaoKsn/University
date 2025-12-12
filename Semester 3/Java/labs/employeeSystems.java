import java.util.Scanner;
class Employee
{
    static int eIDgen = 0;
    static double tSalary = 0;
    static double maxPurchaseSalary = 0;
    String name, employeeID, department, designation;
    double salary;
    int age;

    public Employee()
    {
        this.employeeID = "Employee" + eIDgen++;
    }
    public void read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the following details..");
        System.out.print("Name: ");
        this.name = in.nextLine();
        System.out.print("Age: ");
        this.age = in.nextInt();
        in.nextLine();
        System.out.print("Department: ");
        this.department = in.nextLine();
        System.out.print("Designation: ");
        this.designation = in.nextLine();
        System.out.print("Salary: ");
        this.salary = in.nextDouble();
        // Calculate the total salary connected to the sales dept.
        if (this.department.equalsIgnoreCase("sales"))
            tSalary += this.salary;
        if (this.department.equalsIgnoreCase("purchase") && this.designation.equalsIgnoreCase("manager") && this.salary > maxPurchaseSalary)
            maxPurchaseSalary = this.salary;

    }
    public void write()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Age: " + this.age);
        System.out.println("Department: " + this.department);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
}
class employeeSystems
{
    static {
        System.out.println("== Employee Management ==\n");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Total Employees: ");
        int tEmployees = in.nextInt();

        Employee employee[] = new Employee[5];
        System.out.println("Enter their details");
        for (int i = 0; i < tEmployees; i++) {
            System.out.println("\nEmployee " + (i+1));
            employee[i] = new Employee();
            employee[i].read();
        }

        System.out.println("\n== Employee Details ==");
        for (int i = 0; i < tEmployees; i++) {
            System.out.println("\nEmployee " + (i+1));
            employee[i].write();
        }

        System.out.println("\n== Some more INFO ==");
        System.out.println("Highest Salary for a Manager in purchase: " + Employee.maxPurchaseSalary);
        System.out.println("Total Salary spent on Sales dept.: " + Employee.tSalary);
        return;
    }
}
