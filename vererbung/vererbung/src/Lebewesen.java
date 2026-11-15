//Superklasse von Tier und Pflanze(.java) , wird mit extends Lebewesen (extends <Klassenname>
//zur Superklasse einer Unterklasse und fügt dadurch ohne zusätzlichen Code Attribute und Methoden
//aus der Superklasse hinzu.

//In diesem Fall Attribute int alter; und double größe;
//In diesem Fall Methoden fortPflanzen() und wachen()
//Diese sind nun auch in Tier.java und Pflanze.java integriert, ohne, dass man diese extra dort reinschreiben muss.

public class Lebewesen {
    int alter;
    double größe;


    public void fortPflanzen(){
        System.out.println("Fortpflanzen...");
    }
    public void wachsen() {
        this.größe++;
    }
}
