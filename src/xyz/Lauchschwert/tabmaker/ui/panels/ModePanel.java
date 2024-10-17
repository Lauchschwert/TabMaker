package xyz.Lauchschwert.tabmaker.ui.panels;

import xyz.Lauchschwert.tabmaker.ui.buttons.BassButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.ExportButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.GuitarButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static xyz.Lauchschwert.tabmaker.Constants.Modes.*;

public class ModePanel extends JPanel implements ActionListener {
    GuitarButton guitarButton;
    BassButton bassButton;
    MainPanel mainPanel;
    ExportButton exportBtn;

    public ModePanel(int mode, MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        // for readability
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        // Create Buttons
        guitarButton = new GuitarButton("Guitar Mode");
        bassButton = new BassButton("Bass Mode");
        exportBtn = new ExportButton("Export to .txt");

        // for the event-handling when a button is clicked - without it won't work
        guitarButton.addActionListener(this);
        bassButton.addActionListener(this);
        exportBtn.addActionListener(this);

        // add buttons to Panel
        this.add(guitarButton);
        this.add(bassButton);
        this.add(exportBtn);

        // set active mode according to the default value
        switch (mode) {
            case GUITAR:
                guitarButton.setActive(true);
                break;
            case BASS:
                bassButton.setActive(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "There was an error selecting the default value", "Error - Default value invalid", ERROR);
                System.exit(0);
                break;
        }

        // Panel properties
        this.setOpaque(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resetButtons();
        // handle the source of the event / the origin of the event from the clicked button!
        if (e.getSource() == guitarButton) {
            guitarButton.setActive(true);
            mainPanel.getTabPanel().setMode(GUITAR);
        }
        if (e.getSource() == bassButton) {
            bassButton.setActive(true);
            mainPanel.getTabPanel().setMode(BASS);
        }
        if (e.getSource() == exportBtn) {
            mainPanel.getTabPanel().exportTabs();
        }
    }

    private void resetButtons() {
        guitarButton.setActive(false);
        bassButton.setActive(false);
    }
}
