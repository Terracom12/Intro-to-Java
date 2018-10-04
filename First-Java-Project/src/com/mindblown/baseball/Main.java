package com.mindblown.baseball;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel
{
    public Player mindblownbob;

    public Main()
    {
        super(new GridLayout(3, 1));
        this.mindblownbob = new Player();

        setUpLabels();
    }

    public static void main(String[] arguments)
    {
        SwingUtilities.invokeLater(() -> {
            UIManager.put("swing.boldMetal", Boolean.FALSE);

            createAndShowGUI();
        });
    }

    private static void createAndShowGUI()
    {

    }

    public void setUpLabels()
    {

    }
}
