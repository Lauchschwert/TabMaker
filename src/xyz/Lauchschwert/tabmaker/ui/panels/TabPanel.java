package xyz.Lauchschwert.tabmaker.ui.panels;

import javax.swing.*;
import java.awt.*;

import static xyz.Lauchschwert.tabmaker.Constants.Modes.*;
import static xyz.Lauchschwert.tabmaker.Constants.Strings.*;

public class TabPanel extends JPanel {
    private int rows;
    private String[] strings;
    private MainPanel mainPanel;

    public TabPanel(int mode, MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        setMode(mode);

        // set properties of the panel
        // Set default Layout for the Tabs (default: Guitar)
        this.setLayout(new GridLayout(rows, 1));
        this.setBackground(new Color(25, 25, 75));
    }

    // set mode if it switches
    public void setMode(int mode) {
        this.removeAll();
        
        switch (mode) {
            case GUITAR:
                rows = 6;
                strings = GUITAR_STRINGS;
                break;
            case BASS:
                rows = 4;
                strings = BASS_STRINGS;
                break;
        }
        // create the String Panels
        for (int i = 0; i < rows; i++)
            add(new StringPanel(i, this.strings, mainPanel));
        
        // repaint to show the effect on the panel
        this.revalidate();
        this.repaint();
    }
}
