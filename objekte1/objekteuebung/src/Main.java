public class Main {
    public static void main(String[] args) {
        Bankkonto bankkonto = new Bankkonto("Eris" , "Marcell" , "187187187187" , 200000 , -5000);

        System.out.println(bankkonto.Einzahlung(500));
    }

}