package interfaceinjava;

interface Mobile {

    // Default method
    default void brand() {
        System.out.println("Mobile Brand");
    }

    // Abstract method
    double price();
}

// Samsung Class
class Samsung implements Mobile {

    @Override
    public double price() {
        return 25000.00;
    }

    @Override
    public void brand() {
        System.out.println("Brand: Samsung");
    }
}

// Apple Class
class Apple implements Mobile {

    @Override
    public double price() {
        return 75000.00;
    }

    @Override
    public void brand() {
        System.out.println("Brand: Apple");
    }
}

// Main Class
public class InterfaceMobile {
    public static void main(String[] args) {

        Mobile m1 = new Samsung();
        m1.brand();
        System.out.println("Price: ₹" + m1.price());

        Mobile m2 = new Apple();
        m2.brand();
        System.out.println("Price: ₹" + m2.price());
    }
}