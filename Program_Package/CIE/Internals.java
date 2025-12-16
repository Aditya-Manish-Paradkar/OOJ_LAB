package lab_programs.Java_lab.src.CIE;

import java.util.Scanner;

public class Internals {
    protected int[] internalMarks;

    public Internals() {
        internalMarks = new int[5];
    }

    public void getInternalMarks() {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Enter Internal (CIE) marks for 5 courses:");
        for (int i = 0; i < 5; i++) {
            System.out.print("    Course " + (i + 1) + ": ");
            internalMarks[i] = scan.nextInt();
        }
    }

    public int getInternalMark(int index) {
        return internalMarks[index];
    }
}