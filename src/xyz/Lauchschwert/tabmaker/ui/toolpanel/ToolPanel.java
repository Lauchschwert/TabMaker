package xyz.Lauchschwert.tabmaker.ui.toolpanel;

import xyz.Lauchschwert.tabmaker.ui.buttons.NoteButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolPanel extends JPanel implements ActionListener {
    private NoteButton noteButton;
    public ToolPanel() {
        // Set layout from the Constructor of JPanel
        super(new FlowLayout(FlowLayout.CENTER, 15,15));
        
        // Create Buttons
        noteButton = new NoteButton("0");
        
        // add the ActionListener from the JPanel to the noteButton
        noteButton.addActionListener(this);
        
        // add Buttons to Panel
        this.add(noteButton);
        
        // panel properties
        this.setOpaque(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resetButtons();
        if (e.getSource() == noteButton) {
            noteButton.setActive(true);
        }
    }

    private void resetButtons() {
        noteButton.setActive(false);
    }
}
