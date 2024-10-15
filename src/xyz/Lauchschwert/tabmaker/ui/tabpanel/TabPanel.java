package xyz.Lauchschwert.tabmaker.ui.tabpanel;

import javax.swing.*;
import java.awt.*;

public class TabPanel extends JPanel {
    public TabPanel() {
        // Set default Layout for the Tabs (default: Guitar)
        super(new GridLayout(6,2));
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(800,400));
        this.setBackground(new Color(75,75,255));
    }
}
