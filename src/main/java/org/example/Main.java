package org.example;

import java.util.ArrayList;
import java.util.List;

// Lớp Book để lưu trữ thông tin về một cuốn sách
class Book {
    private String title;
    private String author;
    private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}

// Lớp Library để quản lý các sách
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            System.out.println("Book added: " + book);
        } else {
            System.out.println("Cannot add null book.");
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

// Lớp Main để chạy chương trình
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Library library = new Library();
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 123456));
        library.addBook(new Book("1984", "George Orwell", 234567));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 345678));

        // Thêm 15 cuốn sách mới
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 456789));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 567890));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 678901));
        library.addBook(new Book("The Diary of a Young Girl", "Anne Frank", 789012));
        library.addBook(new Book("1984", "George Orwell", 890123));
        library.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 901234));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1234567));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 2345678));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 3456789));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 4567890));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 5678901));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 6789012));
        library.addBook(new Book("The Diary of a Young Girl", "Anne Frank", 7890123));
        library.addBook(new Book("1984", "George Orwell", 8901234));
        library.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 9012345));

        System.out.println("Listing all books in the library:");
        library.listBooks();
    }
}