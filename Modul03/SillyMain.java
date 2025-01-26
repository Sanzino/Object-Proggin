public class SillyMain {

    public static void main(String[] args) {

        // Oprett et sillyprogram-objekt
        SillyProgram program = new SillyProgram();

        //Endre første navn i names- arrayet

        program.names[0] = "Shaffi";

        // Kaller metoden for å skrive ut arrayene
        program.printArrays();


        program.allPersonsLiving();


    }
}
