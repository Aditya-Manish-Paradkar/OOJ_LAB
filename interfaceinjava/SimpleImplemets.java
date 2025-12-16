package interfaceinjava;

interface X {
    int num = 10;
}

class Y implements X {
    void display() {
        System.out.println(num + 5);
    }
}

public class SimpleImplemets {
    public static void main(String[] args) {
        new Y().display();
    }
}
