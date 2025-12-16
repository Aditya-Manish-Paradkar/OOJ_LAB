public class Exceptiondemo {
    // Custom Exception for invalid age
class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

// Base Class Father
class Father {
    protected int fatherAge;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative!");
        }
        this.fatherAge = age;
        System.out.println("Father's age set to: " + fatherAge);
    }
}

// Derived Class Son
class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);

        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative!");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age!");
        }

        this.sonAge = sonAge;
        System.out.println("Son's age set to: " + sonAge);
    }
}

// Main class to test the program
class AgeTest {
    public static void main(String[] args) {
        try {
            System.out.println("Case 1: Valid ages");
            Son s1 = new Son(40,18);
        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Case 2: Negative father age");
            
            Son s2 = new Son(45, 20);
        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Case 3: Son age >= father age");
            Son s3 = new Son(35, 36);
        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

}
