 import java.util.Scanner;

    public class Schachspiel {

        public static void main(String[] args) {
            Schachbrett schachbrett = new Schachbrett();
            schachbrett.initialisiere();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println(schachbrett);
                System.out.println("Zug eingeben (z.B. e2 e4): ");
                String zug = scanner.nextLine();

                if (zug.equalsIgnoreCase("exit")) {
                    System.out.println("Das Spiel wird beendet.");
                    break;
                }

                try {
                    schachbrett.fuehreZugAus(zug);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ungültiger Zug. Bitte erneut versuchen.");
                }
            }

            scanner.close();
        }
    }

    class Schachbrett {
        private char[][] brett;

        public void initialisiere() {
            brett = new char[][] {
                    {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
                    {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                    {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
            };
        }

        public void fuehreZugAus(String zug) {
            String[] teile = zug.split(" ");
            if (teile.length != 2 || teile[0].length() != 2 || teile[1].length() != 2) {
                throw new IllegalArgumentException("Ungültiger Zug. Bitte im Format 'e2 e4' eingeben.");
            }

            int startZeile = 8 - (teile[0].charAt(1) - '0');
            int startSpalte = teile[0].charAt(0) - 'a';
            int zielZeile = 8 - (teile[1].charAt(1) - '0');
            int zielSpalte = teile[1].charAt(0) - 'a';

            char figur = brett[startZeile][startSpalte];
            brett[startZeile][startSpalte] = ' ';
            brett[zielZeile][zielSpalte] = figur;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    sb.append(brett[i][j]).append(" ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }
