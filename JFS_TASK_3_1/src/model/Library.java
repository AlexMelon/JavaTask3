package model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    private Book[] books;
    private int count;

    public Library(int count) {
        books = new Book[count];
        count = 0;
    }

    public boolean addBook(Book book) {
        if (count <  books.length) {
            books[count] = book;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, count);
    }

    // Remove a book by ISBN
    public boolean removeBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == (id)) {
                // Shift remaining books to the left
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null; // Remove the last reference
                count--; // Decrement count
                return true; // Book removed
            }
        }
        System.out.println("Book with ISBN " + id + " not found!");
        return false; // Book not found
    }

    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
