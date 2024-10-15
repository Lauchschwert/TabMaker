package xyz.Lauchschwert.tabmaker.ui.tabpanel;

import javax.swing.*;
import java.awt.*;

public class TabArea extends JTextArea {
    public TabArea() {
        this.setEditable(false);
        this.setLineWrap(false);
        this.setFocusable(false);
        this.setFont(new Font("sans-serif", Font.BOLD, 18));
        this.setPreferredSize(new Dimension(500,50));
        this.setBackground(new Color(50,50,150));
    }
}
