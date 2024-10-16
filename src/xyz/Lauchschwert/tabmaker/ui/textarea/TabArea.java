package xyz.Lauchschwert.tabmaker.ui.textarea;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TabArea extends JTextField {
    public TabArea() {
        this.setEditable(false);
        this.setFocusable(false);
        this.setFont(new Font("sans-serif", Font.BOLD, 18));
        this.setPreferredSize(new Dimension(500, 50));
        this.setBackground(new Color(50,50,150));
        this.setMargin(new Insets(10,10,10,10));
    }
}
