package UI.MainWindow;

import UI.ModePanel.ModePanel;
import UI.TabPanel.TabPanel;
import UI.ToolPanel.ToolPanel;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public MainPanel() {
        ModePanel modePanel = new ModePanel();
        TabPanel tabPanel = new TabPanel();
        ToolPanel toolPanel = new ToolPanel();
        
        this.setLayout(new BorderLayout());
        this.add(modePanel, BorderLayout.NORTH);
        this.add(tabPanel, BorderLayout.CENTER);
        this.add(toolPanel, BorderLayout.SOUTH);
        
    }
}
