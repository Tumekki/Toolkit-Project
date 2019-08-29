package com.company;

import javax.swing.*;
import java.awt.*;

public class WeightConverterGUI extends JFrame{
    public WeightConverterGUI(){

        WeightConverter converter = new WeightConverter();
        this.setSize(600,250);
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width/2) - (this.getWidth() / 2);
        int yPos = (dim.height/2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Weight Converter");

        JPanel mainPanel = new JPanel();

        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));

        JTextField leftInput = new JTextField("left");
        leftInput.setHorizontalAlignment(JTextField.RIGHT);
        String[] weightChoices = {"Kilogram", "Pound", "Stone", "Ounce"};
        JComboBox leftTypes = new JComboBox(weightChoices);
        leftTypes.setSelectedIndex(0);
        leftPanel.add(leftInput);
        leftPanel.add(leftTypes);

        JTextField rightInput = new JTextField("right");
        rightInput.setHorizontalAlignment(JTextField.RIGHT);
        String[] weightChoices2 = {"Kilogram", "Pound", "Stone", "Ounce"};
        JComboBox rightTypes = new JComboBox(weightChoices2);
        rightTypes.setSelectedIndex(1);
        rightPanel.add(rightInput);
        rightPanel.add(rightTypes);

        JLabel equals = new JLabel("=");
        equals.setFont(new Font("Arial", Font.PLAIN, 20));

        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(leftPanel);
        mainPanel.add(equals);
        mainPanel.add(rightPanel);


        this.add(mainPanel);
        this.setVisible(true);
    }
}
