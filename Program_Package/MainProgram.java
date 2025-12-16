package lab_programs.Java_lab.src;

import java.util.Scanner;

import lab_programs.Java_lab.src.CIE.*;
import lab_programs.Java_lab.src.SEE.*;

public class MainProgram {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scan.nextInt();

        External[] students = new External[n]; 
        Internals[] internals = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter Details for Student " + (i + 1) + " ---");
            
            students[i] = new External();
            internals[i] = new Internals();
            students[i].getData(); 
            internals[i].getInternalMarks();
            students[i].getSeeMarks();
        }


        System.out.println("\n======= FINAL STUDENT MARKS =======");
        for (int i = 0; i < n; i++) {

            students[i].displayData(); 
            
            System.out.println("  Final Marks (CIE + SEE):");
            for (int j = 0; j < 5; j++) {

                int finalMark = internals[i].getInternalMark(j) + students[i].getSeeMark(j);
                
                System.out.println("    Course " + (j + 1) + ": " + finalMark);
            }
        }
        
        scan.close();
    }
}