package snake;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Shape extends Drawable{

    private List<Rect> rects;

    public Shape(Color color){
        setColor(color);
        rects = new ArrayList<>();
    }

    public List<Rect> getRects(){
        return rects;
    }

    public void addRect(Rect rect){
        rects.add(rect);
    }

    public Rect duplicateRect(Rect baseRect){
        int basex = (int) baseRect.getLocation().getX();
        int basey = (int) baseRect.getLocation().getY();
        int baseWidth = (int) baseRect.getDimension().getWidth();
        int baseHeight = (int) baseRect.getDimension().getHeight();

        Point location = new Point(basex - baseWidth, basey);
        Dimension dimension = new Dimension(baseWidth, baseHeight);
        Rect newRect = new Rect (location, dimension);
        return newRect;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        for (Rect r: rects){
            r.draw(g);
        }
    }
}
