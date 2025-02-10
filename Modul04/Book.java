import java.util.ArrayList;

public class Book {
    private String title;

    private String author;

    private int numberOfPages;

    private Genre genre;

    private ArrayList<Chapter> chapters;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public ArrayList<Chapter> getChapters() {
        return chapters;
    }
    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public int readingTime() {
        int sum = 0;
        for (Chapter c : chapters){
            sum = sum + c.getReadingTime();

        }
        return sum;
    }

    public void printMe(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nNumber of pages: " + numberOfPages + "\nGenre: " + genre + "\nChapters: " + chapters);
    }



}
