public class Katze {
    //Attribute für Katze
    int alter;
    String rasse;
    String fellfarbe;
    boolean kannpfotegeben;
    boolean kannplusrechnen;
    boolean kannschnurren;

    //Kontruktor
    public Katze(int alter, String rasse, String fellfarbe, boolean kannpfotegeben, boolean kannplusrechnen, boolean kannschnurren){
    this.alter = alter;
    this.rasse = rasse;
    this.fellfarbe = fellfarbe;
    this.kannpfotegeben = kannpfotegeben;
    this.kannplusrechnen = kannplusrechnen;
    this.kannschnurren = kannschnurren;
    }

    //Methoden

    public void schnurren(){
        System.out.println("Schnurrrr");
    }

    //Erstellt alle get-Methoden, um alle Attribute unter //Attribute in anderen Klassen abzurufen und gegebenenfalls in einer Variable zu speichern.

    public String getRasse(){
        ;
        return rasse;
    }
    public int getAlter(){
        return alter;
    }
    public String getFellfarbe(){
        return fellfarbe;
    }
    public boolean isKannpfotegeben(){
        return kannpfotegeben;
    }
    public boolean isKannplusrechnen() {
        return kannplusrechnen;
    }
    public boolean isKannschnurren() {
        return kannschnurren;
    }

}
