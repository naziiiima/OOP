This Java program defines a Book class that represents a book with four attributes: title, author, isbn, and price. It provides:

Constructors:

A default constructor that initializes the book's attributes with empty or default values.
A parameterized constructor that allows creating a Book object with specific values for title, author, isbn, and price.
Methods:

displayInfo(): Prints the book’s details (title, author, ISBN, price) to the console.
applyDiscount(): Adjusts the price by applying a given discount percentage.
Main Method:

Demonstrates the creation of Book objects using both constructors and the use of the methods to display and update book details.
How It Meets the Requirements:
Class Definition: The class is properly defined as Book, with appropriate attributes and methods.

Attributes: The class has four attributes as required: title, author, isbn, and price.

Constructors:

Default Constructor: Initializes the attributes to default values (empty strings and 0.0).
Parameterized Constructor: Initializes the attributes with specific values when creating a book.
Methods:

displayInfo(): A method to display the book’s details in a formatted way.
applyDiscount(): A method that performs a meaningful action (applying a discount to the book’s price).
Testing:

In the main() method, three objects are created (one with the default constructor and one with the parameterized constructor).
The displayInfo() method is called to display the details of both books.
The applyDiscount() method is tested by applying a 10% discount to the book's price and then displaying the updated information.
