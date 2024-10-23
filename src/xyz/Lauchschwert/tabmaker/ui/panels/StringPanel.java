package xyz.Lauchschwert.tabmaker.ui.panels;

import xyz.Lauchschwert.tabmaker.ui.buttons.NoteButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.StringButton;
import xyz.Lauchschwert.tabmaker.ui.textarea.TabArea;
import xyz.Lauchschwert.tabmaker.NoteSelectorWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringPanel extends JPanel implements ActionListener {
    private final StringButton stringButton;
    private final TabArea tabArea;
    private final TabPanel tabPanel;

    public StringPanel(int panelIndex, String[] strings, TabPanel tabPanel) {
        // Initiate the Panel with super and the Layout we want
        super(new FlowLayout(FlowLayout.CENTER, 20, 15));
        this.tabPanel = tabPanel;

        this.setOpaque(false);

        // Create the StringButton
        stringButton = new StringButton(strings[panelIndex], 50, 50);
        stringButton.addActionListener(this);

        tabArea = new TabArea(panelIndex);
        
        // add Components to Panel
        add(stringButton);
        add(tabArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stringButton) {
            if (tabPanel.getMainPanel().getSelectedTool() instanceof NoteButton) {
                tabArea.setText(new StringBuilder(tabArea.getText()).append(tabPanel.getMainPanel().getSelectedTool().getText()).toString());
            }
        }
    }

    @Override
    public String toString() {
        return tabArea.formatTabs();
    }
    
    public int getRawLength() {
        return this.tabArea.getText().length();
    }
    
    public void addNote(String note) {
        this.tabArea.setText(new StringBuilder(tabArea.getText()).append(note).toString());
    }
}