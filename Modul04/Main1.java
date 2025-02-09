public class Main1 {

    public static void main(String[] args) {
        Book b= new Book();
        b.setAuthor("Shafi The goat");
        b.setTitle("How to be goated");
        b.setNumberOfPages(1);
        b.setGenre(Genre.CLASSIC);

        b.printMe();
    }
}
