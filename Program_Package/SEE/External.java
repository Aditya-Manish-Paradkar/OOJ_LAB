package lab_programs.Java_lab.src.SEE;

import java.util.Scanner;

import lab_programs.Java_lab.src.CIE.Personal;

public class External extends Personal {
    
    protected int[] seeMarks;

    public External() {
        super(); 
        seeMarks = new int[5];
    }

    public void getSeeMarks() {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Enter External (SEE) marks for 5 courses:");
        for (int i = 0; i < 5; i++) {
            System.out.print("    Course " + (i + 1) + ": ");
            seeMarks[i] = scan.nextInt();
        }
    }

    public int getSeeMark(int index) {
        return seeMarks[index];
    }
}