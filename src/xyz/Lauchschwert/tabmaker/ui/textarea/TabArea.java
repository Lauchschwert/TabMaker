package xyz.Lauchschwert.tabmaker.ui.textarea;

import javax.swing.*;
import static xyz.Lauchschwert.tabmaker.Constants.Strings.*;
import java.awt.*;

public class TabArea extends JTextField {
    private final int panelIndex;
    public TabArea(int panelIndex) {
        this.panelIndex = panelIndex;
        this.setEditable(false);
        this.setFocusable(false);
        this.setFont(new Font("sans-serif", Font.BOLD, 18));
        this.setPreferredSize(new Dimension(500, 50));
        this.setBackground(new Color(50,50,150));
        this.setMargin(new Insets(10,10,10,10));
    }
    
    public String formatTabs() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(GUITAR_STRINGS[panelIndex] + " -| ");
        stringBuilder.append(this.getText());
        return stringBuilder.toString();
    }
}
