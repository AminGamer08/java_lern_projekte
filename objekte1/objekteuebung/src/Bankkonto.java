public class Bankkonto {
    String name;
    String vorname;
    String kontonummer;
    int kontostand;
    int limit;

    public Bankkonto(String name , String vorname, String kontonummer,int kontostand, int  limit){
        this.name = name;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.limit = limit;
        this.vorname = vorname;
    }

    public String getKontodaten(){
        return "Name: " + name + ", Vorname: " + vorname + ", Kontonummer: " + kontonummer + ", Kontostand: " + kontostand + "€, Limit: " + limit +"€";
    }
    public String Einzahlung(int einzahlung){
        kontostand += einzahlung;
        return "Ihr neuer Kontostand beträgt: " + kontostand + "€";
    }
    public void Auszahlung(int auszahlung){
        if (kontostand - auszahlung >= -5000) {
            kontostand -= auszahlung;
            System.out.println("Ihr neuer Kontostand beträgt: " + kontostand +"€. Es wurden erfolgreich " + auszahlung + "€ ausgezahlt");
        }
        else {
            System.out.println("Durch diese Auszahlung wäre Ihr Limit von " + limit + "€ erreicht. Ihr Konto wurde nicht belastet.");
            System.out.println("Ihr aktueller Kontostand beträgt: " + kontostand + "€");
        }
    }

    public void getKontostand(){
        System.out.println("Ihr aktueller Kontostand beträgt: " + kontostand + "€");
    }
}
