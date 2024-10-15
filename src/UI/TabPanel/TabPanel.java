package UI.TabPanel;

import javax.swing.*;
import java.awt.*;

public class TabPanel extends JPanel {
    public TabPanel() {
        // Set default Layout for the Tabs (default: Guitar)
        super(new GridLayout(6,2));
        this.setOpaque(false);
        setPreferredSize(new Dimension(600,600));
    }
}
