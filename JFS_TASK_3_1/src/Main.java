import model.Book;
import model.Library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library(5); // Capacity of 5 books

        // Create some books
        Book book1 = new Book(001, "Harry Potter", "JK Rowling", true);
        Book book2 = new Book(002, "The Hunger Games", "Suzanne Collins", false);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        //Remove books by id
        library.removeBookById(001);

        // Display all books
        System.out.println("Books in the library:");
        library.displayBooks();
    }
}