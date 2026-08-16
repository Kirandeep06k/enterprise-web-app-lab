package library.model;
import library.service.Printable;

public class Book extends LibraryResource implements Printable {
    public Book(int id, String title, String author) {
        super(id, title, author);
    }
    public double calculateFine(int overdueDays) { return overdueDays * 5.0; }
    public void printDetails() {
        System.out.println("Book -> ID: " + getResourceId() + ", Title: " + getTitle() + ", Author: " + getAuthor());
    }
}