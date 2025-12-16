import java.util.Scanner;
class Book {

    // Data members
    private String name;
    private String author;
    private double price;
    private int num_pages;

    // Constructor
    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    //tostring...
    public String toString() {
        return "Book Details:\n" +
               "Name      : " + name + "\n" +
               "Author    : " + author + "\n" +
               "Price     : " + price + "\n" +
               "Pages     : " + num_pages + "\n";
    }
}

public class BookClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine(); // consume newline

            books[i] = new Book(name, author, price, pages);
        }

        System.out.println("\n--- Book Information ---");
        for (int u; u<=n; u++) {
            Book current= books[u];
            System.out.println(current.toString()); // calls toString()
        }

        sc.close();
    }
}
