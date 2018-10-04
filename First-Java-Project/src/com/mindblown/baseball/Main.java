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
        JFrame frame = new JFrame("Mind Blown Baseball Team");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        frame.add(new Main());

        frame.pack();
        frame.setVisible(true);
    }

    public void setUpLabels()
    {

    }
}
