package xyz.Lauchschwert.tabmaker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NoteSelectorWindow extends JFrame {
    private int value;
    
    public int getNote() {
        try {
            String input = JOptionPane.showInputDialog(null, "Input a note", "Note input window", JOptionPane.INFORMATION_MESSAGE);
            if (input.isEmpty())
                return 0;
            return value = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input | Input must be a number", "Note input window", JOptionPane.ERROR_MESSAGE);
        }
        return value;
    }
}
