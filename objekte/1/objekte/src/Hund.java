public class Hund {
    //Attribute
    int alter;
    String rasse;
    String fellfarbe;
    boolean kannpfotegeben;
    boolean kannplusrechnen;
    String name;

    //Konstruktor
    public Hund(int alter, String rasse, String fellfarbe, boolean kannpfotegeben, boolean kannplusrechnen, String name){
        this.alter = alter;
        this.rasse = rasse;
        this.fellfarbe = fellfarbe;
        this.kannpfotegeben = kannpfotegeben;
        this.kannplusrechnen = kannplusrechnen;
        this.name = name;
    }

    //Methoden

    public void plusRechnen(int zahl1, int zahl2, int zahl3) {
        if (kannplusrechnen)
        System.out.println(zahl1 + zahl2 + zahl3);
        else System.out.println("Dieser Hund kann nicht plusrechnen");
    }

    public String getRasse(){
        return this.rasse;

    }


}