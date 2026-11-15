package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.println("Was ergibt 3x4?");

        String eingabe = br.readLine();
        int ergebnis = Integer.parseInt(eingabe);

        if (ergebnis == 3 * 4){
            System.out.println("Das Ergebnis ist richtig!");

        }
        else System.out.println("Das Ergebnis ist falsch. Die richtige Lösung ist "+ 3 * 4 +".");
    }
}
