import java.util.Random;

public class SillyProgram {
    // Instansvariabler

    public String[] names = {"John", "Jane", "Bob"};
    private String[] streetNames = {"Frognerveien", "Karl Johansvei", "Bygdøyveien"};
    private int[] numbers = {5, 10, 15, 20, 25};
    private char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};

    // Konstruktør for å initialisere verdiene
    public SillyProgram() {
        // Verdiene er allerede initialisert direkte i deklarasjonen
    }

    // Metode for å vise verdiene i alle arrayene
    public void printArrays() {
        System.out.println("Names: " + java.util.Arrays.toString(names));
        System.out.println("Street names: " + java.util.Arrays.toString(streetNames));
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Characters: " + java.util.Arrays.toString(chars));
    }

    // Metode som skriver ut informasjon om alle personer
    public void allPersonsLiving() {
        Random random = new Random(); // Opprett et Random-objekt for tilfeldig valg

        // For-løkke som går gjennom alle navnene
        for (int i = 0; i < names.length; i++) {
            // Velg et tilfeldig gatenavn, tall og bokstav
            String street = streetNames[random.nextInt(streetNames.length)];
            int number = numbers[random.nextInt(numbers.length)];
            char letter = chars[random.nextInt(chars.length)];

            // Skriv ut den tilfeldige setningen på samme linje
            System.out.print(names[i] + " lives in " + street + " " + number + letter + ". ");
        }
        System.out.println(); // Ny linje etter at for-løkken er ferdig
    }


    }
