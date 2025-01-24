public class Main {
    public static void main(String[] args) {
        int NedTelling = 10; //variabel med verdi større en 7
        while (NedTelling >=0) {//løkken kjører så lenge "number er støree en eller lik 0
            if (NedTelling == 7){ //sjekker om "Nedtelling" er lik 7
                System.out.println("Look - it was 7!");
                
            }else { //hvis "NedTelling" ikek er lik 7
                System.out.println(NedTelling);
            }
            int i = NedTelling--;

        }
        
    }
}
