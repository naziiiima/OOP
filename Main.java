public class Book {
    // Attributes
    private String title;
    private String author;
    private String isbn;
    private double price;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
    }

    // Additional method: applying a discount
    public void applyDiscount(double percentage) {
        this.price = this.price - (this.price * (percentage / 100));
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a default book
        Book defaultBook = new Book();
        defaultBook.displayInfo();

        // Creating a parameterized book
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 10.99);
        myBook.displayInfo();

        // Applying a discount to the parameterized book
        myBook.applyDiscount(10);  // 10% discount
        System.out.println("After discount:");
        myBook.displayInfo();
    }
}