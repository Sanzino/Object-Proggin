package GBToppgave2;

public class BankKonto{
    private String kontoNavn;
    private double saldo;

    //Konstruktør for å initialisere kontonavn og saldo
    public BankKonto(String kontoNavn, double saldo) {
        this.kontoNavn = kontoNavn;
        this.saldo = saldo;
    }

    //Metode for å sette inn penger

    public void innskudd (double beløp) {
        if (beløp > 0 ){
            saldo += beløp;
            System.out.println(beløp + " Kroner er satt inn på kontoen. Ny saldo: " + saldo + " kr");
        } else {
            System.out.println("Beløpet må vøre større enn 0");
        }
    }

    // Metode for å ta ut penger
    public void uttak (double beløp){
        if (beløp > 0 && beløp <= saldo){
            saldo -= beløp;
            System.out.println(beløp + "kroner er tatt ut fra kontoen. Ny saldo: " + saldo + " kr");
        } else if (beløp > saldo) {
            System.out.println("Ikke nok penger på kontoen!");
        } else {
            System.out.println("Beløp må være større enn 0.");

        }
    }

    // Metode for å vise saldo
    public double getSaldo (){
        return saldo;
    }

}