import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame main = new JFrame("Hangman");

        GameSurface gs = new GameSurface(800, 600);

        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setResizable(false);
        main.setVisible(true);
        main.setSize(800, 600);
        main.add(gs);
        main.addKeyListener(gs);
    }
}