import netscape.javascript.JSObject;

import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\Amin\\Documents\\Java\\file\\file\\src\\secret_message.txt");
            int data = reader.read();
            while (data!=-1){
                System.out.print((char)data);
                data=reader.read();
            }
            reader.close();

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}