public class NedTelling{
    public void performNedTelling(int startNummer) {

        int sum = 0; // variabel for å holde summen
// Bruker en for-løkke for å telle ned
        for (int nummer = startNummer; nummer >= 0; nummer--){
            if (nummer == 7){
                System.out.println("Look -it was 7!");

            }else{
                System.out.println(nummer);
            }
            sum +=nummer; // Legger yil det nåværende tallet i summen

            }
        //skriv ut summen av alle tallene
        System.out.println("Summen av alle tallene er: "+ sum);
        }
    }
