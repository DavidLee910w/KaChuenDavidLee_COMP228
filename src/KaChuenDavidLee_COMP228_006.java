import javax.swing.*;

abstract class Book {
    public String title;
    public String description;
    public String publisher;
    public double price;
    public int year;

    @Override
    public String toString() {
        return "Title: " + title +
                "\nDescription: " + description +
                "\nPublisher: " + publisher +
                "\nPrice: " + price +
                "\nYear: " + year;
    }

    // setter methods for each attribute except price
    public void getTitle() {
        System.out.println("Title: " + title);
    }
    public void getDescription() {
        System.out.println("Description: " + description);
    }

    public void getPublisher() {
        System.out.println("Publisher: " + publisher);
    }

    public void getYear() {
        System.out.println("Year: " + year);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }
//constructor

    public Book(String title, String description, String publisher, double price, int year) {
        this.title = title;
        this.description = description;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }
    public abstract void setPrice(double price);
    abstract String getGenre();
}

class ScienceBook extends Book {

    public ScienceBook(String title, String description, String publisher, double price, int year) {
        super(title, description, publisher, price, year);
    }

    @Override
    public String getGenre() {
        return "Science";
    }

    @Override
    public void setPrice(double price) {
        this.price = price * 0.9; // 10% discount
    }
}

class ChildrenBook extends Book {
    public ChildrenBook(String title, String description, String publisher, double price, int year) {
        super(title, description, publisher, price, year);
    }

    @Override
    public String getGenre() {
        return "Children";
    }

    @Override
    public void setPrice(double price) {
        this.price = price; // No discount
    }
}

public class KaChuenDavidLee_COMP228_006 {
    public static void main(String[] args) {
        // Ask user the genre and information of the book
        String genre = JOptionPane.showInputDialog("Enter genre:");
        String title = JOptionPane.showInputDialog("Enter title:");
        String description = JOptionPane.showInputDialog("Enter description:");
        String publisher = JOptionPane.showInputDialog("Enter publisher:");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year:"));
        Book book = null;
        // Based on the user input, create a new book object
        if (genre.equalsIgnoreCase("Science")) {
            book = new ScienceBook(title, description, publisher, price, year);
        } else if (genre.equalsIgnoreCase("Children")) {
            book = new ChildrenBook(title, description, publisher, price, year);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid genre.");
            return;
        }

        // display the book information
        JOptionPane.showMessageDialog(null, "Genre: " + book.getGenre() + "\n" + book.toString());
    }
}