package xyz.Lauchschwert.tabmaker.ui.modpanel;

import xyz.Lauchschwert.tabmaker.ui.buttons.BassButton;
import xyz.Lauchschwert.tabmaker.ui.buttons.GuitarButton;
import xyz.Lauchschwert.tabmaker.ui.tabpanel.TabPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static xyz.Lauchschwert.tabmaker.Constraints.Modes.*;

public class ModePanel extends JPanel implements ActionListener {
    GuitarButton guitarButton;
    BassButton bassButton;
    TabPanel tabPanel;
    public ModePanel(int mode, TabPanel tabPanel) {
        this.tabPanel = tabPanel;
        // for readability
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        // Create Buttons
        guitarButton = new GuitarButton("Guitar Mode");
        bassButton = new BassButton("Bass Mode");

        // for the event-handling when a button is clicked - without it won't work
        guitarButton.addActionListener(this);
        bassButton.addActionListener(this);

        // add buttons to Panel
        this.add(guitarButton);
        this.add(bassButton);

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
            tabPanel.setMode(GUITAR);
        } else if (e.getSource() == bassButton) {
            bassButton.setActive(true);
            tabPanel.setMode(BASS);
        }
    }

    private void resetButtons() {
        guitarButton.setActive(false);
        bassButton.setActive(false);
    }
}
