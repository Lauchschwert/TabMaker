package xyz.Lauchschwert.tabmaker.ui.toolpanel;

import xyz.Lauchschwert.tabmaker.ui.buttons.NoteButton;
import xyz.Lauchschwert.tabmaker.ui.tabpanel.TabPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolPanel extends JPanel implements ActionListener {
    private NoteButton noteButton;
    private TabPanel tabPanel;

    public ToolPanel(TabPanel tabPanel) {
        // Set layout from the Constructor of JPanel
        super(new FlowLayout(FlowLayout.CENTER, 15, 15));

        this.tabPanel = tabPanel;

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
        if (e.getSource() == noteButton) {
            noteButton.setActive(!noteButton.isActive());
        }
    }

    private void resetButtons() {
        noteButton.setActive(false);
    }
}
