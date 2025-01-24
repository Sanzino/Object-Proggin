package GBToppgave3;

public class Kjøretøy {
    private String merke;
    private String modell;
    private int hjul;

    // Konstruktør
    public Kjøretøy(String merke, String modell, int hjul) {
        this.merke = merke;
        this.modell = modell;
        this.hjul = hjul;
    }

    // Metode for å vise informasjon
    public void visInfo () {
        System.out.println("Kjøretøy: " + merke + " " + modell + " med " + hjul + "hjul.");
    }
}
