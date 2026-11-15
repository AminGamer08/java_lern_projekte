public class Mitarbeiter {
    String vorname;
    String nachname;
    double gehalt;

    public Mitarbeiter(String vorname , String nachname , double gehalt){
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setGehalt(double wert){
        this.gehalt = wert;
    }

}
