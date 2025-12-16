package interfaceinjava;

//Create interface Payment with method pay().
//Classes UPI, CardPayment, NetBanking implement it.
// Payment Interface
interface Payment {
    void pay(double amount);   // abstract method
}

// UPI Payment Class
class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made through UPI.");
    }
}

// Card Payment Class
class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made through Credit/Debit Card.");
    }
}

// Net Banking Class
class NetBanking implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made through Net Banking.");
    }
}

// Main Class
public class InterfacePayment {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay(1500);

        Payment p2 = new CardPayment();
        p2.pay(2500);

        Payment p3 = new NetBanking();
        p3.pay(3200);
    }
}