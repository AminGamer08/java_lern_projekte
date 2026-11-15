public class Fahrzeug {
    double preis;
    String modell;
    int baujahr;
    int kilometerstand;


    public Fahrzeug(double preis , String modell , int baujahr , int kilometerstand){
        this.preis = preis;
        this.baujahr = baujahr;
        this.modell = modell;
        this.kilometerstand = kilometerstand;
    }


    public double getPreis(){
        return this.preis;
    }
    public String getModell(){
        return this.modell;
    }
    public int getBaujahr(){
        return this.baujahr;
    }
    public int getKilometerstand(){
        return this.kilometerstand;
    }
    public void setPreis(double preis){
        this.preis = preis;
    }
}
