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
        mainLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        //tempConverter opens the GUI for converting temperatures
        JButton tempConverter = new JButton("Temperature Converter");
        tempConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConverterGUI gui = new ConverterGUI();
                dispose();
            }
        });
        tempConverter.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton weightConverter = new JButton("Weight Converter");
        weightConverter.setFont(new Font("Arial", Font.PLAIN, 20));
        weightConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WeightConverterGUI gui = new WeightConverterGUI();
                dispose();
            }
        });

        //JButton that opens the calculator window and closes the current one
        JButton calculator = new JButton("Calculator");
        calculator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorGUI gui = new CalculatorGUI();
                dispose();
            }
        });
        calculator.setFont(new Font("Arial", Font.PLAIN, 20));

        //Set the components to align in the center
        mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        tempConverter.setAlignmentX(Component.CENTER_ALIGNMENT);
        weightConverter.setAlignmentX(Component.CENTER_ALIGNMENT);
        calculator.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Add the components and spaces between into main JPanel
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(mainLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(tempConverter);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(weightConverter);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(calculator);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
