package modulbackup;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Drawing extends Canvas {
    private ArrayList<DrawablePolygon> list;

    public Drawing(int width, int height) {
        setSize(width,height);
        setBackground(Color.WHITE);
        list = new ArrayList<DrawablePolygon>();
    }

    public void add(DrawablePolygon cp) {
        list.add(cp);
    }

    public void paint(Graphics g) {
        for (DrawablePolygon dp : list) {
            dp.draw(g);
        }
    }

    public void step() {
        for (DrawablePolygon dp : list ) {
            dp.step();
        }
        repaint();
    }
}
