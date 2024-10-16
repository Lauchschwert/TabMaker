package xyz.Lauchschwert.tabmaker.ui.windows;

import xyz.Lauchschwert.tabmaker.ui.panels.MainPanel;

import javax.swing.*;

public class Window extends JFrame {
    MainPanel tabPanel;
    public Window() {
        // Use the constructor of JFrame to set the Window title
        super("Tabmaker");
        
        // create and add the MainPanel
        tabPanel = new MainPanel();
        add(tabPanel);
        
        // set some crucial Properties of the Window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }
}
