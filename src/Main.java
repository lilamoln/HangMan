import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GUI gui = new GUI();
        Game game = new Game(gui);
    }
}