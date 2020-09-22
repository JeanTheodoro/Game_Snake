package snake;

import java.awt.*;

public class Rect {

    private Color color;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rect(int x, int y, int with, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = with;
        this.height = height;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
