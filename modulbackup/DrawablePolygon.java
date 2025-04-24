package modulbackup;

import java.awt.Polygon;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class DrawablePolygon extends Polygon implements Actor {
    public Color color;
    public boolean visible;
    public int count;

    DrawablePolygon() {
        super();          //Call the constructor of the superclass Polygon
        color = Color.GRAY;
        visible = true;
        count = 0;
    }

    public void draw(Graphics g) {
        if (visible) {
            g.setColor(color);
            g.fillPolygon(this);    
        }
    }

    @Override
    public void step() {
        count++;
        if (count == 10 ) {
            visible = !visible;
            count = 0;
        }
    }
}
