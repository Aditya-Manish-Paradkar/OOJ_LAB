class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    Account(String n, int a, String t, double b) {
        name = n;
        accNo = a;
        accType = t;
        balance = b;
    }

    void deposit(double amt) {
        balance = balance + amt;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {

    SavAcct(String n, int a, double b) {
        super(n, a, "Savings", b);
    }

    void computeInterest() {
        double interest = balance * 0.05;
        balance = balance + interest;
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance = balance - amt;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurAcct extends Account {
    double minBalance = 1000;
    double penalty = 50;

    CurAcct(String n, int a, double b) {
        super(n, a, "Current", b);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance = balance - amt;
            if (balance < minBalance) {
                balance = balance - penalty;
                System.out.println("Penalty imposed");
            }
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Bank {
    public static void main(String[] args) {

        SavAcct s = new SavAcct("Alice", 101, 5000);
        s.deposit(1000);
        s.computeInterest();
        s.withdraw(2000);
        s.displayBalance();

        CurAcct c = new CurAcct("Bob", 102, 1500);
        c.deposit(500);
        c.withdraw(1200);
        c.displayBalance();
    }
}
