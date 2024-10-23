package xyz.Lauchschwert.tabmaker.ui.windows;

import xyz.Lauchschwert.tabmaker.ui.panels.MainPanel;

import javax.swing.*;

public class Window extends JFrame {
    MainPanel mainPanel;
    public Window() {
        // Use the constructor of JFrame to set the Window title
        super("Tabmaker");
        
        // create and add the MainPanel
        mainPanel = new MainPanel();
        add(mainPanel);
        
        // set some crucial Properties of the Window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }
}
