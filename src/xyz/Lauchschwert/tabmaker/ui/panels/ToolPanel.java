package xyz.Lauchschwert.tabmaker.ui.panels;

import xyz.Lauchschwert.tabmaker.ui.buttons.NoteButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.TabButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ToolPanel extends JPanel implements ActionListener {
    private NoteButton noteButton;
    private TabPanel tabPanel;
    private ArrayList<TabButton> toolButtons;

    public ToolPanel(TabPanel tabPanel) {
        // Set layout from the Constructor of JPanel
        super(new FlowLayout(FlowLayout.CENTER, 15, 15));
        
        toolButtons = new ArrayList<>();

        this.tabPanel = tabPanel;

        // Create Buttons
        noteButton = new NoteButton("0");

        // add the ActionListener from the JPanel to the noteButton
        noteButton.addActionListener(this);

        // add Buttons to Panel
        this.add(noteButton);
        
        // add Buttons to ButtonList
        toolButtons.add(noteButton);

        // panel properties
        this.setOpaque(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == noteButton) {
            noteButton.setActive(!noteButton.isActive());
        }
    }
    
    public TabButton getSelectedTool() {
        for (TabButton toolButton : toolButtons) {
            if (toolButton.isActive()) {
                return toolButton;
            }
        }
        return null;
    }
}
