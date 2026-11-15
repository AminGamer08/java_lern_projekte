import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("nevergonnagiveyouup.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        Object[] options = new String[]{"Start", "Pause", "Stop", "Schließen"};
        int eingabe = JOptionPane.showOptionDialog(null, "Never gonna give you up ~ Rick Astley"
                , "Musikplayer", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, -1);
        clip.open(audioStream);


        while (true) {
            if (!clip.isOpen()) {
                clip.open(audioStream);
            } else if (eingabe == 0) {
                clip.start();
                eingabe = JOptionPane.showOptionDialog(null, "Never gonna give you up ~ Rick Astley"
                        , "Musikplayer", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, -1);
            } else if (eingabe == 1) {
                clip.stop();
                eingabe = JOptionPane.showOptionDialog(null, "Never gonna give you up ~ Rick Astley"
                        , "Musikplayer", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, -1);
            } else if (eingabe == 2) {
                clip.stop();
                clip.setFramePosition(0);
                eingabe = JOptionPane.showOptionDialog(null, "Never gonna give you up ~ Rick Astley"
                        , "Musikplayer", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, -1);
            } else if (eingabe == -1) {
                clip.close();
                System.exit(0);
            } else if (eingabe == 3) {
                clip.close();
                System.exit(0);
            }

        }
    }
}


