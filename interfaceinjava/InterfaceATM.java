package interfaceinjava;
//define interface simiar to class 
interface ATM {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

// SBIATM Class implementing ATM interface
class SBIATM implements ATM {
    private double balance;

    // Constructor to set initial balance
    SBIATM(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


public class InterfaceATM {
    public static void main(String[] args) {

        // Create SBIATM object with initial balance
        SBIATM atm = new SBIATM(5000);

        atm.checkBalance();
        atm.deposit(1500);
        atm.withdraw(2000);
        atm.checkBalance();
    }
}

