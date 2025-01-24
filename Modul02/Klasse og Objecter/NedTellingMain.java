//Hoved klassen med main-metoden

public class NedTellingMain  {
    public static void main(String[] args) {
        //opretter et ojekt av nedtelling-klassen
        NedTelling nedTelling;
        nedTelling = new NedTelling();

        //kall på metoden som utfører nedtellingen
        nedTelling.performNedTelling(10);


    }
}
