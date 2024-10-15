package UI.ToolPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolPanel extends JPanel implements ActionListener {
    public ToolPanel() {
        // Set layout from the Constructor of JPanel
        super(new FlowLayout(FlowLayout.CENTER, 15,15));
        
        // Create Buttons
        NoteButton noteButton = new NoteButton("0");
        
        // add Buttons to Panel
        this.add(noteButton);
        
        // panel properties
        this.setOpaque(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
