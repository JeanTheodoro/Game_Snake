package snake;

import java.awt.*;

public class Rect extends Drawable{

    private Point location;
    private Dimension dimension;

    public Rect(Point location, Dimension dimension){
        this.location = location;
        this.dimension = dimension;
    }

    public Rect(int x, int y, int width, int height){
        this.location = new Point(x,y);
        this.dimension = new Dimension(width, height);
    }

    public Point getLocation() { return location; }

    public Dimension getDimension() { return dimension; }

    @Override
    public void draw(Graphics g) {
        g.fillRect((int) location.getX(), (int) location.getY(), (int) dimension.getWidth(), (int) dimension.getHeight());
    }

    public void paint(Graphics g){

    }
}
