package xyz.Lauchschwert.tabmaker.ui.panels;

import xyz.Lauchschwert.tabmaker.NoteSelectorWindow;
import xyz.Lauchschwert.tabmaker.ui.buttons.ChangeNoteButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.EmptyNoteButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.NoteButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.TabButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ToolPanel extends JPanel implements ActionListener {
    private NoteButton noteButton;
    private ChangeNoteButton changeNoteBtn;
    EmptyNoteButton emptyNoteBtn;
    private TabPanel tabPanel;
    private ArrayList<TabButton> toolButtons;

    public ToolPanel(TabPanel tabPanel) {
        // Set layout from the Constructor of JPanel
        super(new FlowLayout(FlowLayout.CENTER, 15, 15));

        this.tabPanel = tabPanel;

        toolButtons = new ArrayList<>();

        //create both buttons
        noteButton = new NoteButton("0");
        changeNoteBtn = new ChangeNoteButton("?", 50, 50);
        emptyNoteBtn = new EmptyNoteButton("-", 50, 50);

        // initiate both buttons
        initiateButtonToPanel(noteButton);
        initiateButtonToPanel(changeNoteBtn);
        initiateButtonToPanel(emptyNoteBtn);

        // panel properties
        this.setOpaque(false);
    }

    private void initiateButtonToPanel(TabButton button) {
        this.add(button);
        button.addActionListener(this);
        toolButtons.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof NoteButton) {
            noteButton.setActive(!noteButton.isActive());
        }
        if (e.getSource() instanceof ChangeNoteButton) {
            int note = NoteSelectorWindow.getNote();
            noteButton.setText(String.valueOf(note));
        }
        if (e.getSource() instanceof EmptyNoteButton) {
            ArrayList<StringPanel> stringPanels = tabPanel.getShortPanels();
            for (StringPanel stringPanel : stringPanels) {
                stringPanel.addNote(emptyNoteBtn.getText());
            }
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
