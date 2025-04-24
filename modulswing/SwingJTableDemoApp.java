package modulswing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class SwingJTableDemoApp {

    //Column headings
    String[] colHeads = {"Name", "Extension", "ID#"};
    //Initialize data
    Object[][] data = {
        {"Gail", "4567", "865"},
        {"Ken", "7566", "555"},
        {"Viviane", "7345", "922"},
        {"Melanie", "7345", "932"},
        {"Anne", "1224", "333"},
        {"John", "5656", "314"},
        {"Matt", "5672", "217"},
        {"Erwin", "9023", "519"},
        {"Ellen", "1134", "532"},
        {"Helen", "6751", "145"},
    };

    SwingJTableDemoApp() {

        //Set upp the JFrame
        //Create a new JFrame container 
        JFrame frame = new JFrame("A Swing JScrollPane Demo");
        //Give the frame a initial size
        frame.setSize(400, 250);
        //Terminate the program when the user close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a Table
        JTable table = new JTable(data, colHeads);

        //Add the tabel to a scroll pane
        JScrollPane jsp = new JScrollPane(table);

        //Add the scroll pane to the frame
        frame.add(jsp);

        //Display the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        //Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingJTableDemoApp();
            }            
        });

    }
    
}
