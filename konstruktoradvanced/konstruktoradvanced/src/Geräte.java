public class Geräte{
    int stromverbrauch;
    String nutzen;

    //Super-Konstruktor konstruiert Attribute für PC.java und Geräte.java, welche in ihrem Konstruktor an Oberklasse (also diese) weitergeben.
    public Geräte(int stromverbrauch, String nutzen) {
        this.stromverbrauch = stromverbrauch;
        this.nutzen = nutzen;
    }
}
