package snake;

import org.w3c.dom.css.Rect;

public class Game {

    private GameWindow gameWindow;
    private Snake snake;
    private Renderer renderer;


    public void start(){
        snake = new Snake();
        gameWindow = new GameWindow();
        renderer = gameWindow.getRenderer();

        addElementosToScreen();
        run();

    }

    private void addElementosToScreen(){
        renderer.add(new Background());
        renderer.add(new Snake());
    }

    public void run(){
        do{
            gameWindow.repaint();
            try{
                Thread.sleep(30);
            }catch (InterruptedException e){

            }
        }while(!isGameOver());
    }

    private  boolean isGameOver(){
        return false;
    }
}
