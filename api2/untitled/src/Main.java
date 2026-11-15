import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {


            int x = Integer.parseInt(JOptionPane.showInputDialog("Gebe bitte eine ganze Zahl zum Dividieren ein (Dividend):"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Bitte gebe die 2. ganze Zahl ein (Divisor):"));
            JOptionPane.showMessageDialog(null , "Dein Rechenergebnis " +
                    "lautet " + x /y +".","Ihr Ergebnis ist da!", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null , "Du kannst nicht durch 0 teilen!",
                    "Warnung",JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Bitte gebe nur Zahlen ein!","Warnung",JOptionPane.ERROR_MESSAGE);
        }
        finally {
            JOptionPane.showMessageDialog(null,"Ende");
        }
    }
}