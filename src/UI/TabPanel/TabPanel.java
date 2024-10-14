package UI.TabPanel;

import javax.swing.*;
import java.awt.*;

public class TabPanel extends JPanel {
    public TabPanel() {
        super(new GridLayout(6,2));
        this.setBackground(new Color(255,0,255));
        setPreferredSize(new Dimension(600,600));
    }
}
