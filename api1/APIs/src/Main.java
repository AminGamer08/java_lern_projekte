import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(180000 , "Tesla Model S" , 2022 , 0 , "schwarz");

        int x = JOptionPane.showConfirmDialog(null , "Möchten Sie den Preis ändern?" , "Titel" , 0);
        if (x == 0){
            String eingabe = JOptionPane.showInputDialog("Neuer Preis:");

            double preisNeu = Double.parseDouble(eingabe);
            auto.setPreis(preisNeu);
            JOptionPane.showMessageDialog(null,"Der neue Preis des Autos beträgt " + auto.getPreis() + "€");
        }
        else JOptionPane.showMessageDialog(null ,"Der Preis des Autos wurde nicht geändert. Der Preis beträgt " + auto.getPreis() + "€");


    }
}