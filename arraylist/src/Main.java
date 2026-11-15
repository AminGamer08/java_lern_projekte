import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            // ArrayList = a resizable array.

        ArrayList<String> food = new ArrayList<>();

    food.add("pizza");
    food.add("Hamburger");
    food.add("Hotdog");
    food.clear();

    food.set(0, "sushi");
    food.remove(2);



        for (String s : food) {
            System.out.println(s);

        }
    }
}