package UI.MainWindow;

import javax.swing.*;

public class Window extends JFrame {
    MainPanel tabPanel;
    public Window() {
        super("Tabmaker");
        
        tabPanel = new MainPanel();
        add(tabPanel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
