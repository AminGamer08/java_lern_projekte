import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        /*for (int i = 0; i<500; i++) {
            int zufall = random.nextInt(6) + 1;
            System.out.println(zufall);
        } */
        String Konsonanten = "BCDFGHJKLMNPQRSTVWXYZ";
        String word = "";
        String Vokale = "AEIOU";

        for (int ii = 0; ii<100; ii++) {
            word = "";
            for (int i = 0; i < 4; i++) {
                if (i != 1 && i != 3) {
                    int stelle = random.nextInt(21);
                    word += Konsonanten.charAt(stelle);
                } else {
                    int stelle = random.nextInt(5);
                    word += Vokale.charAt(stelle);
                }
            }

            System.out.println(word);
        }
    }
}