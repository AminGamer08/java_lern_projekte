public class Motorrad extends Fahrzeug{
    int hubraum;

    public Motorrad(double preis , String modell, int baujahr , int kilometerstand , int hubraum){
        super(preis , modell ,  baujahr ,  kilometerstand);
        this.hubraum = hubraum;

    }
    public int getHubraum(){
        return this.hubraum;
    }
}
