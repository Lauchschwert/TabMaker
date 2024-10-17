package xyz.Lauchschwert.tabmaker.ui.panels;

import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

import static xyz.Lauchschwert.tabmaker.Constants.Modes.*;
import static xyz.Lauchschwert.tabmaker.Constants.Strings.*;

public class TabPanel extends JPanel {
    private int rows;
    private String[] strings;
    private MainPanel mainPanel;
    private ArrayList<StringPanel> stringPanels;

    public TabPanel(int mode, MainPanel mainPanel) {
        this.mainPanel = mainPanel;

        // initiate the strinPanel list
        this.stringPanels = new ArrayList<>();

        // set the default mode
        setMode(mode);

        // set properties of the panel
        // Set default Layout for the Tabs (default: Guitar)
        this.setLayout(new GridLayout(rows, 1));
        this.setBackground(new Color(25, 25, 75));
    }

    // set mode if it switches
    public void setMode(int mode) {
        this.removeAll();

        switch (mode) {
            case GUITAR:
                rows = 6;
                strings = GUITAR_STRINGS;
                break;
            case BASS:
                rows = 4;
                strings = BASS_STRINGS;
                break;
        }
        // create the String Panels
        for (int i = 0; i < rows; i++) {
            StringPanel stringPanel = new StringPanel(i, strings, this);
            this.add(stringPanel);
            stringPanels.add(stringPanel);
        }

        // repaint to show the effect on the panel
        this.revalidate();
        this.repaint();
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public void exportTabs() {
        StringBuilder stringBuilder = new StringBuilder();
        File selectedFile = null;

        // set wanted directory
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int fileInt = fileChooser.showOpenDialog(this);

        if (fileInt == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
        }

        // get longest tab length
        for (StringPanel stringPanel : stringPanels) {
            stringBuilder.append(stringPanel.toString() + "\n");
        }

        System.out.println(stringBuilder.toString());

        try {
            if (selectedFile == null) {
                JOptionPane.showMessageDialog(null, "You must select a folder", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(selectedFile + "\\" + "tabs.txt", false));
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.close();
                JOptionPane.showConfirmDialog(null, "Successfully saved file to: " + selectedFile.getAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
