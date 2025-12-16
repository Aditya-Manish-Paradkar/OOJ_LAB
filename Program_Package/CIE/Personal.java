package lab_programs.Java_lab.src.CIE;
import java.util.Scanner;

public class Personal {
    protected String usn;
    protected String name;
    protected int sem;

    public void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("  Enter USN: ");
        usn = scan.nextLine();
        System.out.print("  Enter Name: ");
        name = scan.nextLine();
        System.out.print("  Enter Semester: ");
        sem = scan.nextInt();
    }

    public void displayData() {
        System.out.println("------------------------------------");
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Semester: " + sem);
    }
}