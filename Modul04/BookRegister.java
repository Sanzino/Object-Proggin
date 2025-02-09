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
            b.printMe(); //kalelr printMe() i stedet for to string
        }

    }


}
