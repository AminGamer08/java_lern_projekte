public class PC extends Geräte{
    String CPU;
    String Grafikkarte;
    String Mainboard;

    public PC(String CPU, String Grafikkarte, String Mainboard , int stromverbrauch , String nutzen){
        super(stromverbrauch,nutzen);
        this.CPU = CPU;
        this.Grafikkarte = Grafikkarte;
        this.Mainboard = Mainboard;
    }

    public void getCPU(){
        System.out.println(this.CPU);
    }
    public void getGrafikkarte(){
        System.out.println(this.Grafikkarte);
    }
    public void getMainboard(){
        System.out.println(this.Mainboard);
    }
    public void getStromverbrauch(){
        System.out.println(this.stromverbrauch);
    }

    public void getNutzen(){
        System.out.println(this.nutzen);
    }

}

