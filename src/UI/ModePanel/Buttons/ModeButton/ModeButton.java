package UI.ModePanel.Buttons.ModeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class ModeButton extends JButton implements ActionListener {
    public ModeButton(String text) {
        super(text);
        setPreferredSize(new Dimension(120, 50));
        addActionListener(this);
        setFocusPainted(false);
        setFont(new Font("sans-serif", Font.PLAIN, 14));
    }
}