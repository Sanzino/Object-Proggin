import java.util.ArrayList;


public class BookRegister {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public int numberOfBooks() {
        return books.size();
    }

    public void allBooksInRegister() {
        for (Book b:
                books) {
            b.printMe(); //kaller printMe() i stedet for to string
        }

    }

    public void booksByGenre(Genre genre) {
        for (Book b:
                books) {
            if (b.getGenre() == genre) {
                b.printMe();
            }

        }

    }

    public void booksByAuthor(String author) {
        for (Book b:
                books) {
            if (b.getAuthor().equals(author)) {
                b.printMe();
            }

        }

    }

    public ArrayList<Book> booksByReadingTime(int minutes) {
        ArrayList<Book> booksToReturn = new ArrayList<>();
        for (Book b :
                books) {
            if (b.readingTime() >= minutes) {
                booksToReturn.add(b);
            }

        }
        return booksToReturn;

    }


}
