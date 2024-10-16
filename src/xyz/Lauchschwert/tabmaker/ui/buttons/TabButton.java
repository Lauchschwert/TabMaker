package xyz.Lauchschwert.tabmaker.ui.buttons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public abstract class TabButton extends JButton {
    
    private boolean selected;
    private Color defaultBackgroundColor = new Color(0,50,150);
    private Color activeBackgroundColor = defaultBackgroundColor.brighter().brighter();
    private Border defaultBorder = BorderFactory.createLineBorder(Color.blue, 2, true);
    private Border activeBorder = BorderFactory.createLineBorder(Color.white, 2, true);
    
    // "Pattern" for every button
    public TabButton(String text, int width,int height) {
        super(text);
        setPreferredSize(new Dimension(width, height));
        setFocusPainted(false);
        setFont(new Font("sans-serif", Font.BOLD, 16));
        setBackground(new Color(0,50, 150));
        setBorder(BorderFactory.createLineBorder(new Color(0,0,255), 2, true));
        setForeground(Color.WHITE);
    }
    
    public void setActive(boolean selected) {
        this.selected = selected;
        if (selected) {
            this.setBackground(this.activeBackgroundColor);
            this.setBorder(this.activeBorder);
        } else {
            this.setBackground(this.defaultBackgroundColor);
            this.setBorder(this.defaultBorder);
        }
    }
    public boolean isActive() {
        return this.selected;
    }
}