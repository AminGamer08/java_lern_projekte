import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //For: Code x mal ausführen
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Hallo! \n Hier kannst du dir kannst alle geraden Zahlen von 2 Zahlen ausgeben lassen");
        System.out.println("Bitte gebe hier die erste Zahl an:");
        int x = scan1.nextInt();
        System.out.println("Dankeschön! Bitte gebe jetzt die 2. Zahl an:");
        int y = scan2.nextInt();
        System.out.println("Vielen Dank! Der Prozess war erfolgreich und alle Zahlen zwischen " + x + " und " + y + " " +
                "werden jetzt ausgegeben:");
        for (int i = x; i <= y; i+=2){
            System.out.println(i);
        }

    }
}