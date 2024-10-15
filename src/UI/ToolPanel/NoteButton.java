package UI.ToolPanel;

import UI.ModePanel.Buttons.ModeButton.TabButton;

import java.awt.event.ActionEvent;

public class NoteButton extends TabButton{
    // Inherit ToolButton and use it as a Template. Change Title in Constructor using The ToolButton Constructor
    public NoteButton(String title) {
        super(title, 50,50);
    }
}
