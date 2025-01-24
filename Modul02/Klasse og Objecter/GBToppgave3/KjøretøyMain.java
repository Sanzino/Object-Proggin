package GBToppgave3;

public class KjøretøyMain {
    public static void main(String[] args) {
        // Oprett en bil
        Bil bil = new Bil("Austin Martin", "R0", 4, 5);
                bil.visInfo();

        System.out.println();

        // Oprett en sykkel
        Sykkel sykkel =new Sykkel("Giant", "Escape", 2, true);
        sykkel.visInfo();
    }
}
