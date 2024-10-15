package UI.ModePanel.Buttons.ModeButton;

import javax.swing.*;
import java.awt.*;

public abstract class TabButton extends JButton {
    // "Pattern" for the Buttons to switch tabModes
    public TabButton(String text, int width,int height) {
        super(text);
        setPreferredSize(new Dimension(width, height));
        setFocusPainted(false);
        setFont(new Font("sans-serif", Font.PLAIN, 14));
    }
}