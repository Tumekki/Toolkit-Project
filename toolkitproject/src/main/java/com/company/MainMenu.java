package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    public MainMenu(){


        this.setSize(800,400);
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width/2) - (this.getWidth() / 2);
        int yPos = (dim.height/2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Toolkit");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        JLabel mainLabel = new JLabel("Main Menu");

        JButton tempConverter = new JButton("Temperature Converter");
        tempConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConverterGUI gui = new ConverterGUI();
                dispose();
            }
        });

        mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        tempConverter.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(mainLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(tempConverter);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
