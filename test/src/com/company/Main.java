package com.company;
import java.awt.event.InputEvent;
import java.io.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args)throws IOException {

	InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
        System.out.println("Bitte Gewünschte Menge angeben:");
    String eingabe = br.readLine();
    int ergebnis = Integer.parseInt(eingabe);


    int bestellmenge = ergebnis;
    int bestand = 50;
    boolean zahlung = false;

    System.out.println("Bitte Zahlung mit 'Zahlen' bestätigen");
    String zahlungseingang = br.readLine();

    if (zahlungseingang.equals("Zahlen")) {
        zahlung = true;

    }
    else System.out.println("Fehler");



    if ( (bestellmenge <= bestand)&&zahlung) {
        System.out.println("Der Artikel wird ausgeliefert.");

    }
    else if (bestellmenge<=bestand){
        System.out.println("Die Lieferung Erfolgt nach erfolgreichem Zahlungseingang.");

    }
    else {
        System.out.println("Die gewünschte Menge ist nicht verfügbar.");
        System.out.println("Es sind nur noch "+bestand+" Artikel auf Lager");




    }
 }
}
