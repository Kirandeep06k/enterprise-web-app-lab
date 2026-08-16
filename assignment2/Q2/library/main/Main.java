package library.main;

import library.model.LibraryResource;
import library.model.Book;
import library.model.DigitalResource;
import library.service.Printable;
import library.util.InputValidator;

public class Main {
    public static void main(String[] args) {
        LibraryResource[] resources = new LibraryResource[5];
        int[] overdueDays = {10, 0, 5, 3, 7};

        resources[0] = new Book(1, "Java Basics", "James Gosling");
        resources[1] = new DigitalResource(2, "OS Notes", "Andrew Tanenbaum");
        resources[2] = new Book(3, "DSA Guide", "Robert Sedgewick");
        resources[3] = new DigitalResource(4, "AI eBook", "Stuart Russell");
        resources[4] = new Book(5, "DBMS Concepts", "Korth");

        double totalFine = 0;

        for (int i = 0; i < resources.length; i++) {
            LibraryResource r = resources[i];
            if (!InputValidator.validateResourceId(r.getResourceId()) ||
                !InputValidator.validateFineDays(overdueDays[i])) continue;

            ((Printable) r).printDetails();
            double fine = r.calculateFine(overdueDays[i]);
            System.out.println("Overdue Days: " + overdueDays[i] + ", Fine: " + fine);
            totalFine += fine;
        }

        System.out.println("Total Fine: " + totalFine);
        LibraryResource.displayTotalResources();
    }
}