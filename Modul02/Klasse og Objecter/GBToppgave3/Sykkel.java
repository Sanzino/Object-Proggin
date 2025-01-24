package GBToppgave3;
// Sykkel.java (subklasse)

public class Sykkel extends Kjøretøy {
    private boolean harGir;

    // Konstruktør

    public Sykkel(String merke, String modell, int hjul, boolean harGir){
        super(merke, modell, hjul); // Kaller konstruktør til Kjøretøy
        this.harGir = harGir;
    }

    @Override
    public void visInfo() {
        super.visInfo(); // Kaller metoden fra superklassen
        System.out.println("Har gir: " + (harGir? "ja" : "Nei"));
    }
}
