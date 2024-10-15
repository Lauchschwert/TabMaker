package UI.MainWindow;

import UI.ModePanel.ModePanel;
import UI.TabPanel.TabPanel;
import UI.ToolPanel.ToolPanel;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public MainPanel() {
        // Create the Main Panels used for Tab Creation
        ModePanel modePanel = new ModePanel();
        TabPanel tabPanel = new TabPanel();
        ToolPanel toolPanel = new ToolPanel();
        
        // Set Layout and add Buttons to the Panel
        this.setLayout(new BorderLayout());
        this.add(modePanel, BorderLayout.NORTH);
        this.add(tabPanel, BorderLayout.CENTER);
        this.add(toolPanel, BorderLayout.SOUTH);
        
        // set Properties
        this.setBackground(new Color(25,0,100));
        
    }
}
