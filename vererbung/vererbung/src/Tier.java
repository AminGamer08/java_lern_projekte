//Das ist eine Unterklasse von Lebenwesen
                 //extends Lebewesen -> fügt Attribute und Methoden aus Superklasse Lebewesen ein
public class Tier extends Lebewesen{
    //Attribute
    String geräusch;
    boolean kannfliegen;
    //Konstruktor
    public Tier(String geräusch, boolean kannfliegen, int alter, double größe){
        this.geräusch = geräusch;
        this.kannfliegen = kannfliegen;
        this.alter = alter;
        this.größe = größe;
    }

    public Tier() {

    }


    //Methoden
    public void macheGeräusch() {
        System.out.println(geräusch);
    }

}
