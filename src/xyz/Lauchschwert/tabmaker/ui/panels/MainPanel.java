package xyz.Lauchschwert.tabmaker.ui.panels;

import xyz.Lauchschwert.tabmaker.ui.buttons.TabButton;

import javax.swing.*;
import java.awt.*;

import static xyz.Lauchschwert.tabmaker.Constants.Modes.*;

public class MainPanel extends JPanel {
    private TabPanel tabPanel;
    private ModePanel modePanel;
    private ToolPanel toolPanel;
    private final int mode = GUITAR;
    public MainPanel() {
        // Create the Main Panels used for Tab Creation
        tabPanel = new TabPanel(mode, this);
        modePanel = new ModePanel(mode, tabPanel);
        toolPanel = new ToolPanel(tabPanel);
        
        // Set Layout and add Buttons to the Panel
        this.setLayout(new BorderLayout());
        this.add(modePanel, BorderLayout.NORTH);
        this.add(tabPanel, BorderLayout.CENTER);
        this.add(toolPanel, BorderLayout.SOUTH);
        
        // set Properties
        this.setBackground(new Color(15,10,45));
    }

    public TabButton getSelectedTool() {
        return toolPanel.getSelectedTool();
    }
}
