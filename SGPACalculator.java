import java.util.Scanner;

class Student{
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int n;

    void acceptDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
    double calculateSGPA() {
        int totalCredits = 0;
        int weightedSum = 0;

        for (int i = 0; i < n; i++) {
            totalCredits += credits[i];
            weightedSum += credits[i] * marks[i];
        }

        return (double) weightedSum / totalCredits;
    }
    void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("USN  : " + usn);
        System.out.println("Name : " + name);

        for (int i = 0; i < n; i++) {
            System.out.println(
                "Subject " + (i + 1) +
                "  Credits: " + credits[i] +
                "  Marks: " + marks[i]
            );
        }

        System.out.println("SGPA: " + calculateSGPA());
    }
}

public class SgpaCalculator{
    public static void main(String[] args) {

        Student s = new Student();

        s.acceptDetails();
        s.displayDetails();
    }
}
