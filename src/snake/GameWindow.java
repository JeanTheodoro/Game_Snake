package snake;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private Rect background;
    private Snake snake;
    private Renderer renderer;

    public GameWindow() {

        renderer = new Renderer();

        Background background = new Background();
        renderer.add(background);

        snake = new Snake();
        renderer.add(snake);

        setSize(Constants.WINDOW_WITH, Constants.WINDOW_HEIGHT);
        setResizable(false);
        setTitle(Constants.GAME_TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public Renderer getRenderer(){
        return renderer;
    }

    @Override
    public void paint(Graphics g) {
        renderer.render(g);
    }
}
