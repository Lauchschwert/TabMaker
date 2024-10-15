package xyz.Lauchschwert.tabmaker.ui.stringpanel;

import xyz.Lauchschwert.tabmaker.Constraints;
import xyz.Lauchschwert.tabmaker.ui.buttons.StringButton;
import xyz.Lauchschwert.tabmaker.ui.tabpanel.TabArea;
import xyz.Lauchschwert.tabmaker.ui.tabpanel.TabPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static xyz.Lauchschwert.tabmaker.Constraints.Strings.*;

public class StringPanel extends JPanel implements ActionListener {
    public StringPanel(int panelIndex, String[] strings) {
        // Initiate the Panel with super and the Layout we want
        super(new FlowLayout(FlowLayout.CENTER, 20, 15));
        
        this.setOpaque(false);
        
        
        
        // Create the StringButton
        StringButton stringButton = new StringButton(strings[panelIndex], 50,50);
        TabArea tabArea = new TabArea();
        
        // add Components to Panel
        add(stringButton);
        add(tabArea);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
