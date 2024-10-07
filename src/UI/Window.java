package UI;

import javax.swing.*;

public class Window extends JFrame {
    TabPanel tabPanel;
    public Window() {
        super("Tabmaker");
        
        tabPanel = new TabPanel();
        add(tabPanel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
