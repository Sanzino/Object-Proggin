package GBToppgave2;

public class BankKontoMain {
    public static void main(String[] args) {
        // Opprett en ny bankonto
        BankKonto konto = new BankKonto("Min sparekonto", 1000);

        // Sett inn penger
        konto.innskudd(500);;

        // Ta ut penger
        konto.uttak(300);

        // Forsøk å ta ut mer enn saldoen
        konto.uttak(1500);;

        // Skriv ut den gjeldene saldoen
        System.out.println("Gjeldene saldo: " + konto.getSaldo() + " kr");

    }
}
