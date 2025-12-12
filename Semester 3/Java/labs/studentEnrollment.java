import java.util.Scanner;

class Student
{
    static int tStudents = 0;
    String name;
    int marks[];
    public Student(String name)
    {
        this.name = name;
        marks = new int[3];
    }
    public static int countStudents()
    {
        return tStudents;
    }
    public void read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Marks in 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Mark " + (i+1) + " ");
            marks[i] = in.nextInt();
        }
    }
    public double avgBestOfTwo()
    {
        // Perform mergeSort in the descending order.
        mergeSort(marks, 0, 2);
        double avg = marks[0] / 2.0, tmpavg = marks[0] / 2.0;
        for(int i = 1; i < 3; i++) {
            if (marks[i] == marks[0])
              continue;
            avg += marks[i]/2.0;
            break;
        }
        // If the largest mark is itself the second largest.
        if (avg == tmpavg) {
            avg = avg * 2;
        }
        return avg;
    }
    public void mergeSort(int arr[], int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            // Sort the first half.
            mergeSort(arr, left, mid);
            // Sor the second half.
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public void merge(int arr[], int left, int mid, int right)
    {
        int i = left, j = mid + 1, k = 0;
        int tmp[] = new int[right-left+1];
        while (i <= mid && j <= right) {
            if (arr[i] > arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }
        while (i <= mid)
            tmp[k++] = arr[i++];
        while (j <= right)
            tmp[k++] = arr[j++];
        for (i = left; i <= right; i++)
            arr[i] = tmp[i-left];
    }
}

class studentEnrollment
{
    static {
        System.out.println("== Welcome to Student Enrollment System! ==\n");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Total Students: ");
        int tStudents = in.nextInt();
        in.nextLine();

        Student students[] = new Student[tStudents];
        for (int i = 0; i < tStudents; i++) {
            System.out.println("\nStudent " + (i+1));
            System.out.print("Name: ");
            String name = in.nextLine();
            students[i] = new Student(name);
            // Read the marks in 3 subjects.
            students[i].read();
            Student.tStudents++;
        }
        // Average of best of two.
        System.out.println("\nAverage of Best of Two for each student");
        for (int i = 0; i < tStudents; i++) {
            System.out.println("\nStudent " + (i+1) + " : " + students[i].avgBestOfTwo());
        }
        return;
    }
}
