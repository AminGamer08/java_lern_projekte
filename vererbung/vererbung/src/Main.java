public class Main {

    public static void main(String[] args) {
        //Superklasse, Unterklasse


        //Objekte
        Tier tier = new Tier("Auuu Auuuuu" , false, 69 , 1.87);
        Pflanze pflanze = new Pflanze();

        //Code
        tier.macheGeräusch();
        System.out.println(tier.größe);
        pflanze.gebefrüchte();


    }
}