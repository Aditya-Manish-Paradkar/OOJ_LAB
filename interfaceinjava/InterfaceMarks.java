
package interfaceinjava;

//Create interface Exam with method getMarks().
//Class Student implements interface and calculates total marks.
// Exam Interface
interface Exam {
    int getMarks();   // method to return marks of a subject
}

// Student Class implementing Exam interface
class Student implements Exam {
    private int subject1;
    private int subject2;
    private int subject3;

    // Constructor to initialize marks
    Student(int s1, int s2, int s3) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }

    // Implementing getMarks() to return total marks
    @Override
    public int getMarks() {
        return subject1 + subject2 + subject3;
    }

    // Display total marks
    public void showTotal() {
        System.out.println("Total Marks: " + getMarks());
    }
}

// Main Class
public class InterfaceMarks {
    public static void main(String[] args) {
        // Create student object with subject marks
        Student s = new Student(85, 90, 92);

        // Display total marks
        s.showTotal();
    }
}
