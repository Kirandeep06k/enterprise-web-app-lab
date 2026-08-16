package library.model;
import library.service.Printable;

public class DigitalResource extends LibraryResource implements Printable {
    public DigitalResource(int id, String title, String author) {
        super(id, title, author);
    }
    public double calculateFine(int overdueDays) { return overdueDays * 2.0; }
    public void printDetails() {
        System.out.println("Digital Resource -> ID: " + getResourceId() + ", Title: " + getTitle() + ", Author: " + getAuthor());
    }
}