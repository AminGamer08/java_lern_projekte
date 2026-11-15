public class Kühlschrank extends Geräte{
    String marke;
    double kühlleistung;
    boolean hatdisplay;

    public Kühlschrank(String marke, double kühlleistung, boolean hatdisplay, int stromverbrauch , String nutzen){
        super(stromverbrauch , nutzen);
        this.marke = marke;
        this.kühlleistung = kühlleistung;
        this.hatdisplay = hatdisplay;
    }

    public String getMarke(){
        return this.marke;
    }

    public double getKühlleistung(){
        return this.kühlleistung;
    }

    public boolean isHatdisplay(){
        return this.isHatdisplay();
    }

    public int getStromverbrauch(){
        return this.stromverbrauch;
    }
    public String getNutzen(){
        return this.nutzen;
    }


}
