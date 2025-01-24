package GBToppgave1;

public class Bil {
    private String merke;
    private String modell;
    private int år;

    // Konstruktør
    public Bil(String merke, String modell, int år){
        this.merke = merke;
        this.modell = modell;
        this.år = år;
    }

    //Metode for å starte bilen
    public void start(){
        System.out.println(merke + " " + modell + " starter nå! ");
    }

    //Metode for å stoppe bilen
    public void stopp(){
        System.out.println(merke + " " + modell + " har stoppet.");
    }

}
