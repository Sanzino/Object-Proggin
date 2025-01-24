package GBToppgave3;
// Bil.java (subklasse)

public class Bil extends Kjøretøy {
    private int antallSeter;

    //Konstruktør
    public  Bil(String merke, String modell, int hjul, int antallSeter){
        super(merke, modell, hjul); // Kaller konstruktøren til Kjøretøy
        this.antallSeter = antallSeter;
    }


    @Override
    public void visInfo() {
        super.visInfo(); // Kaller metoden fra Superklassen
        System.out.println("Antall seter: " + antallSeter);
    }
}


