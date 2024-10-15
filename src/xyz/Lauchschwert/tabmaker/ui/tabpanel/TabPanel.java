package xyz.Lauchschwert.tabmaker.ui.tabpanel;

import xyz.Lauchschwert.tabmaker.Constraints;
import xyz.Lauchschwert.tabmaker.ui.stringpanel.StringPanel;

import javax.swing.*;
import java.awt.*;

import static xyz.Lauchschwert.tabmaker.Constraints.Modes.*;
import static xyz.Lauchschwert.tabmaker.Constraints.Strings.*;

public class TabPanel extends JPanel {
    private int rows;
    private String[] strings;

    public TabPanel(int mode) {
        // Set default Layout for the Tabs (default: Guitar)
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
        this.setLayout(new GridLayout(rows, 1));

        // set properties of the panel
        this.setBackground(new Color(25, 25, 75));

        // create the String Panels
        for (int i = 0; i < rows; i++)
            add(new StringPanel(i, this.strings));
    }
}
