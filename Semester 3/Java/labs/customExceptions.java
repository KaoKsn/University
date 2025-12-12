// 8 - Extending the Exception class.
class tooYoung extends Exception
{
    String msg;
    tooYoung(String msg)
    {
        super(msg);
    }
}
class tooOld extends Exception
{
    String msg;
    tooOld(String msg)
    {
        super(msg);
    }
}
class Candidate
{
    String name;
    int age;
    public Candidate(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void verifyAge() throws tooYoung, tooOld
    {
        if (this.age < 18)
            throw new tooYoung("Under age");
        else if (this.age > 45)
            throw new tooOld("Age limit: 45");
        else
            System.out.println("Eligible: " + this.name);
    }
}
class customExceptions
{
    public static void main(String args[])
    {
        Candidate brian = new Candidate("Brian", 16);
        Candidate carlo = new Candidate("Carlo", 48);
        Candidate jane = new Candidate("Jane", 30);

        // Under Age.
        try {
            brian.verifyAge();
        }
        catch (tooYoung msg) {
            System.out.println(msg);
        }
        catch (tooOld msg) {
            System.out.println(msg);
        }
        // Age limit exceeding.
        try {
            jane.verifyAge();
            carlo.verifyAge();
        }
        catch (tooYoung msg) {
            System.out.println(msg);
        }
        catch (tooOld msg) {
            System.out.println(msg);
        }
        finally {
            System.out.println("\n** Age verification Complete **");
        }
    }
}
