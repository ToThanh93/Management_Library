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
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
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

        System.out.println("Listing all books in the library:");
        library.listBooks();
    }
}