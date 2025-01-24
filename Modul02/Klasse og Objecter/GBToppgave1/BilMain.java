package GBToppgave1;

public class BilMain {
    public static void main(String[] args) {
        //opretter et Bil-objekt
        Bil minBil = new Bil("Mercedes", "M 5", 2020);

        //Kall på metodene
        minBil.start();
        minBil.stopp();
    }

}
