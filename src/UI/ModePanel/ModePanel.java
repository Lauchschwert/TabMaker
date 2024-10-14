package UI.ModePanel;

import UI.ModePanel.Buttons.ModeButton.BassButton;
import UI.ModePanel.Buttons.ModeButton.GuitarButton;

import javax.swing.*;
import java.awt.*;

public class ModePanel extends JPanel {
    public ModePanel() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 15,15));

        GuitarButton guitarButton = new GuitarButton("Guitar Mode");
        BassButton bassButton = new BassButton("Bass Mode");
        
        this.add(guitarButton);
        this.add(bassButton);
    }
}
