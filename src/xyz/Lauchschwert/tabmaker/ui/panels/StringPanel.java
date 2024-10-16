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
    private TabArea tabArea;
    private final MainPanel mainPanel;

    public StringPanel(int panelIndex, String[] strings, MainPanel mainPanel) {
        // Initiate the Panel with super and the Layout we want
        super(new FlowLayout(FlowLayout.CENTER, 20, 15));
        this.mainPanel = mainPanel;

        this.setOpaque(false);
        
        // Create the StringButton
        stringButton = new StringButton(strings[panelIndex], 50, 50);
        stringButton.addActionListener(this);
        
        tabArea = new TabArea();
       

        // add Components to Panel
        add(stringButton);
        add(tabArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == stringButton) {
            if (mainPanel.getSelectedTool() == null)
                return;
            if (mainPanel.getSelectedTool() instanceof NoteButton) {
                NoteSelectorWindow noteSelector = new NoteSelectorWindow();
                tabArea.setText(new StringBuilder(tabArea.getText()).append(noteSelector.getNote()).append(" ").toString());
            }
        }
    }
}