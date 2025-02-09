
public class Main {
    public static void main(String[] args) {
        BookRegister br = new BookRegister();
        Book b1 = new Book();
        b1.setTitle("Slut");
        b1.setGenre(Genre.ACTION);
        b1.setAuthor("John Doe");
        b1.setNumberOfPages(100);
        br.addBook(b1);

        Book b2 = new Book();
        b2.setTitle("Pimp");
        b2.setGenre(Genre.CLASSIC);
        b2.setAuthor("John Doe");
        b2.setNumberOfPages(100);
        br.addBook(b2);
        System.out.println("Number of books in register:" + br.numberOfBooks());
}

