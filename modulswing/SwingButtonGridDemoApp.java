package modulswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

//@SuppressWarnings("serial")
public class SwingButtonGridDemoApp extends JPanel {

    JFrame frame = new JFrame();
    int t = 9;

    public SwingButtonGridDemoApp() { // constructor
        frame.setContentPane(this);
        setLayout(new GridLayout(t, t, 3, 3));
        addButtons(t);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (int i = 0; i <= 9; i++) {
            if (i % 3 == 0) {
                int coordx = getWidth() * i / 9;
                int coordy = getHeight() * i / 9;
                g.drawLine(coordx, 0, coordx, getHeight());
                g.drawLine(0, coordy, getWidth(), coordy);
            }
        }
    }

    private void addButtons(int t) {
        JButton grid;
        for (int y = 0; y < t; y++) {
            for (int x = 0; x < t; x++) {
                grid = new JButton(x + "," + y); // creates new button
                grid.setPreferredSize(new Dimension(55, 55));
                add(grid); // adds button to grid

            }
        }
    }

    public static void main(String[] args) throws Exception {
        String str = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        //String str = "javax.swing.plaf.metal.DefaultMetalTheme";
        UIManager.setLookAndFeel(str);
        new SwingButtonGridDemoApp();
    }
    
}
