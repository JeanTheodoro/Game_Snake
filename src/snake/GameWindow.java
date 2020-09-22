package snake;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private Rect background;
    private Rect rect;

    public GameWindow(){

        background = new Rect(0, 0, Constants.WINDOW_WITH, Constants.WINDOW_HEIGHT, Constants.BACKGROUND);
        rect = new Rect(150,150, 200, 200, Color.GREEN);

        setSize(Constants.WINDOW_WITH, Constants.WINDOW_HEIGHT);
        setResizable(false);
        setTitle(Constants.GAME_TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
       background.paint(g);
       rect.paint(g);
    }
}
