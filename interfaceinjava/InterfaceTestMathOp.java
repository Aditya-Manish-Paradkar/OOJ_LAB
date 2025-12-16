package interfaceinjava;

// Create an interface MathOp with a static method add(int a, int b) and an abstract method multiply(int a, int b)
// MathOp Interface
interface MathOp {

    // Static method in interface
    static int add(int a, int b) {
        return a + b;
    }

    // Abstract method
    int multiply(int a, int b);
}

// Class implementing MathOp
class Calculator implements MathOp {

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}

// Main Class
public class InterfaceTestMathOp {
    public static void main(String[] args) {

        // Calling static method from interface
        System.out.println("Addition: " + MathOp.add(10, 20));

        // Calling multiply using implementing class
        Calculator calc = new Calculator();
        System.out.println("Multiplication: " + calc.multiply(10, 20));
    }
}