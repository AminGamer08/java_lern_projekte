public class Main{

    public static void main(String[] args){
        Hund Kylo = new Hund(1, "Mops", "schwarz", true, false, "Kylo");
        Hund Money = new Hund(2, "Labrador", "Blond", true, true,"Money");
        Hund Frieda = new Hund(10, "Deutsche Dogge", "schwarz", true, false,"Frieda");

        Hund[] hunde = {Kylo, Money, Frieda};

        //Gibt aus wie viele Hunde Pfote geben können, indem eine for-Schleife für jeden Hund im Array hunde in der counter Variable 1 hochzählt wenn kannpfotegeben == true
        int counter = 0;
        for (int i = 0; i < hunde.length; i++){
            if (hunde[i].kannpfotegeben){
                counter++;
            }
        }
        System.out.println(counter + " Hunde können Pfote geben.");
        //Ende der for Schleife

        Katze Mira = new Katze(1, "BKH", "Grau", true, false,true);

        //Gibt mithilfe einer getArt() Methode aus, welche Art der jeweilige Hund ist und erstellt zur Vereinfachung eine Variable
        String kyloart = Kylo.getRasse();
        System.out.println("Kylo ist von der Rasse ein/e " + kyloart);

        System.out.println("Hallo!");
        System.out.println("Das ist");
        System.out.println("\n" +
                "    ,·'´¨;.  '                         ,.-·.          ,. -  .,                              ,.,   '      \n" +
                "    ;   ';:\\           .·´¨';\\        /    ;'\\'      ,' ,. -  .,  `' ·,                     ;´   '· .,     \n" +
                "   ;     ';:'\\      .'´     ;:'\\      ;    ;:::\\     '; '·~;:::::'`,   ';\\                .´  .-,    ';\\   \n" +
                "   ;   ,  '·:;  .·´,.´';  ,'::;'     ';    ;::::;'     ;   ,':\\::;:´  .·´::\\'             /   /:\\:';   ;:'\\' \n" +
                "  ;   ;'`.    ¨,.·´::;'  ;:::;       ;   ;::::;      ;  ·'-·'´,.-·'´:::::::';          ,'  ,'::::'\\';  ;::'; \n" +
                "  ;  ';::; \\*´\\:::::;  ,':::;‘      ';  ;'::::;     ;´    ':,´:::::::::::·´'       ,.-·'  '·~^*'´¨,  ';::; \n" +
                " ';  ,'::;   \\::\\;:·';  ;:::; '      ;  ';:::';       ';  ,    `·:;:-·'´            ':,  ,·:²*´¨¯'`;  ;::'; \n" +
                " ;  ';::;     '*´  ;',·':::;‘        ';  ;::::;'      ; ,':\\'`:·.,  ` ·.,           ,'  / \\::::::::';  ;::'; \n" +
                " \\´¨\\::;          \\¨\\::::;          \\*´\\:::;‘      \\·-;::\\:::::'`:·-.,';        ,' ,'::::\\·²*'´¨¯':,'\\:;  \n" +
                "  '\\::\\;            \\:\\;·'            '\\::\\:;'        \\::\\:;'` ·:;:::::\\::\\'      \\`¨\\:::/          \\::\\'  \n" +
                "    '´¨               ¨'                `*´‘          '·-·'       `' · -':::''      '\\::\\;'            '\\;'  '\n" +
                "                                                                                  `¨'                   \n");
        String MiraRasse = Mira.getRasse();
        //Der folgende Code gibt Informationen über Mira in Textform aus.
        System.out.println("Mira ist von der Rasse ein/e " + Mira.getRasse() + ".");
        /* Diese if Schleife wird benötigt, um zu überprüfen, ob das Alter von Mira aktuell 1 entspricht oder höher ist, da in der deutschen Sprache bei 1 Jahr
        "Sie ist 1 Jahr alt" gesagt wird, aber alles darüber "Sie ist 5 Jahre alt".                                                                             */

        if (Mira.getAlter() > 1){
            System.out.println("Sie ist " + Mira.getAlter() + " Jahr alt.");

        }
        else System.out.println("Sie ist " + Mira.getAlter() + " Jahre alt.");

        System.out.println("Außerdem ist ihr Fell " + Mira.getFellfarbe() + ".");

        //Diese if-Schleife behandelt alle Fälle der boolean Variablen, welche lauten: kannpfotegeben, kannplusrechen und kannschnurren
        if (Mira.isKannpfotegeben() && Mira.isKannplusrechnen() && Mira.isKannpfotegeben()) {
            System.out.println("Mira kann Pfote geben, Plus rechnen und schnurren.");
        }
        else if (Mira.isKannpfotegeben() && Mira.kannschnurren && !Mira.kannplusrechnen) {
                    System.out.println("Mira kann Pfote geben und schnurren, aber nicht Plus rechnen.");
            }
            else if (Mira.kannplusrechnen && Mira.isKannschnurren() && !Mira.kannpfotegeben){
                    System.out.println("Mira kann Plus rechen und schnurren, aber keine Pfote geben.");
                }
            else if (Mira.isKannplusrechnen() && !Mira.isKannschnurren() && Mira.isKannpfotegeben()){
            System.out.println("Mira kann Plus rechnen und Pfote geben, aber nicht schnurren.");
        }
            else if (!Mira.isKannplusrechnen() && !Mira.isKannschnurren() && Mira.isKannpfotegeben()){
            System.out.println("Mira kann Pfoten geben, aber nicht schnurren und Plus rechnen.");
        }
            else if (!Mira.isKannplusrechnen() && Mira.isKannschnurren() && !Mira.isKannpfotegeben()){
            System.out.println("Mira kann schnurren, aber nicht Plus rechnen und Pfote geben.");
        }
            else if (Mira.isKannplusrechnen() && !Mira.isKannschnurren() && !Mira.isKannpfotegeben()){
            System.out.println("Mira kann Plus rechnen, aber nicht schnurren und kann keine Pfote geben.");
        }
            else
            System.out.println("Mira kann garnichts.");





    }
        }