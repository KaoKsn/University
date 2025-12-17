// 10 - String Handling.
import java.util.Scanner;

class strOpr
{
    String para;
    int paralen;
    public strOpr(String para)
    {
        this.para = para;
        this.paralen = para.length();
    }
    public void printCharAt(int index)
    {
        if (index < 0 || index >= paralen) {
            System.out.println("Invalid Index Requested!");
            return;
        }
        System.out.printf("Char at index %d is: %c\n", index, para.charAt(index));
    }
    public void compareAgainst(String tok)
    {
        System.out.println("In a normal comparison: " + para.compareTo(tok));
        System.out.println("In a case ignored comparsion: "+ para.compareToIgnoreCase(tok));
        return;
    }
    public void searchAndReplaceWith(String tok)
    {
        int index = para.indexOf(tok);
        Scanner in = new Scanner(System.in);
        if (index != -1) {
            System.out.printf("First Occurance at index: %d\n", index);
            System.out.print("Replacement token: ");
            String alt = in.nextLine();
            System.out.println(para.replace(tok, alt));
            return;
        }
        System.out.println("Target not found!");
    }
    public void extractText(int start, int end)
    {
        if (start < 0 || start >= paralen || end > paralen || start > end) {
            System.out.println("Invalid Index requested!");
            return;
        }
        System.out.println("Requested Substring: " + para.substring(start, end));
    }
}
class textProcessing
{
    static {
        System.out.println("== TEXT PROCESSOR ==\n");
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int choice, n, end;
        String tok;
        System.out.print("Paragraph: ");
        String para = in.nextLine();

        strOpr engine = new strOpr(para);
        while (true) {
            System.out.println("\n== MENU ==");
            System.out.println("1. charAt index");
            System.out.println("2. Compare with a key");
            System.out.println("3. Search for a key and replace");
            System.out.println("4. Extract a substring");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            choice = in.nextInt();
            in.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Index: ");
                    n = in.nextInt();
                    in.nextLine();
                    engine.printCharAt(n);
                    break;
                case 2:
                    System.out.print("Key: ");
                    tok = in.nextLine();
                    engine.compareAgainst(tok);
                    break;
                case 3:
                    System.out.print("Key: ");
                    tok = in.nextLine();
                    engine.searchAndReplaceWith(tok);
                    break;
                case 4:
                    System.out.print("Start Index: ");
                    n = in.nextInt();
                    System.out.print("End Index: ");
                    end = in.nextInt();
                    in.nextLine();
                    engine.extractText(n, end);
                    break;
                case 5:
                    System.out.println("Exiting..!");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
