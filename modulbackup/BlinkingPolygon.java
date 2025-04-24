package modulbackup;

import java.awt.Graphics;

@SuppressWarnings("serial")
public class BlinkingPolygon extends DrawablePolygon {
    public boolean visible;
    public int count;

    public BlinkingPolygon() {
        super();
        visible = true;
        count = 0;
    }

    public void draw(Graphics g) {
        if (visible) {
            super.draw(g);
        }
    }

    public void step() {
        count++;
        if (count == 10 ) {
            visible = !visible;
            count = 0;
        }
    }
}
