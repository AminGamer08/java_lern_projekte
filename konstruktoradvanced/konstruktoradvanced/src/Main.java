import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        PC pc = new PC("i9 1300k","RTX 4090","Asus ROG Z790 Master", 1100, "Zocken und so");

        //JOptionPane.showMessageDialog(null , pizza.bread + ", "+ pizza.topping +", "+ pizza.cheese +", "+ pizza.sauce ,
          //      "Das sind die Zutaten der Pizza:" , JOptionPane.INFORMATION_MESSAGE);



        pc.getCPU();

    }
}