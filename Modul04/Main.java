import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookRegister br = new BookRegister();
        Book b1 = new Book();
        b1.setTitle("Slut");
        b1.setGenre(Genre.ACTION);
        b1.setAuthor("John Doe");
        b1.setNumberOfPages(100);
        b1.setChapters(new ArrayList<Chapter>());
        br.addBook(b1);

        Book b2 = new Book();
        b2.setTitle("Pimp");
        b2.setGenre(Genre.CLASSIC);
        b2.setAuthor("John Doe");
        b2.setNumberOfPages(100);
        Chapter c1 = new Chapter();
        c1.setTitle("Chapter 1");
        c1.setChapterNumber(25);
        c1.setReadingTime(8);
        Chapter c2 = new Chapter();
        c2.setTitle("Chapter 2");
        c2.setChapterNumber(15);
        c2.setReadingTime(5);
        ArrayList<Chapter> chapters = new ArrayList<Chapter>();
        chapters.add(c1);
        chapters.add(c2);
        b2.setChapters(chapters);
        br.addBook(b2);

        System.out.println("Number of books in register:" + br.numberOfBooks());
        br.allBooksInRegister();
        br.booksByGenre(Genre.ACTION);
        System.out.println("books by Jhon Doe:");
        br.booksByAuthor("John Doe");

        System.out.println("By reading time 3");
        ArrayList<Book> books = br.booksByReadingTime(3);
        for (Book b :
                books) {
            System.out.println(b);
        }

    }
}

