package xyz.Lauchschwert.tabmaker.ui.mainwindow;

import xyz.Lauchschwert.tabmaker.ui.modpanel.ModePanel;
import xyz.Lauchschwert.tabmaker.ui.tabpanel.TabPanel;
import xyz.Lauchschwert.tabmaker.ui.toolpanel.ToolPanel;

import javax.swing.*;
import java.awt.*;

import static xyz.Lauchschwert.tabmaker.Constraints.Modes.*;

public class MainPanel extends JPanel {
    private final int mode = GUITAR;
    public MainPanel() {
        // Create the Main Panels used for Tab Creation
        ModePanel modePanel = new ModePanel(mode);
        TabPanel tabPanel = new TabPanel(mode);
        ToolPanel toolPanel = new ToolPanel();
        
        // Set Layout and add Buttons to the Panel
        this.setLayout(new BorderLayout());
        this.add(modePanel, BorderLayout.NORTH);
        this.add(tabPanel, BorderLayout.CENTER);
        this.add(toolPanel, BorderLayout.SOUTH);
        
        // set Properties
        this.setBackground(new Color(15,10,45));
        
    }
}
