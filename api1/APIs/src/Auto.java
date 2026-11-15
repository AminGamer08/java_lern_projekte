public class Auto extends Fahrzeug{
    String farbe;

    public Auto(int preis , String modell , int baujahr , int kilometerstand , String farbe){
        super(preis, modell , baujahr , kilometerstand);
        this.farbe = farbe;
    }
}
