package MidtermRevision.AdvancedOOP;

class Author {

    public String name;
    private String nationality;

}
class Book {

    private String title;
    Author author;

    public Book(String title, String name) {
        this.title = title;
        author = new Author();
        author.name = name;
    }
    public void getBookInfo(Book book){
        System.out.println("Title: " + book.title + "\nAuthor: " + book.author.name);
    }
}
public class q3 {

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        book.getBookInfo(book);
    }

}
