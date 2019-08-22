package com.company;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class GUI extends JFrame{

    public GUI(){
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
        JLabel mainLabel = new JLabel("Temperature Converter");

        String[] temperatureChoices = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
        JComboBox temperatures = new JComboBox(temperatureChoices);
        temperatures.setSelectedIndex(0);
        temperatures.setMaximumSize(new Dimension(150,40));

        JLabel celsius = new JLabel("Celsius");
        celsius.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField toConvert = new JTextField();
        toConvert.setMaximumSize(new Dimension(150,20));


        JButton convert = new JButton("=");
        JLabel fahrenheit = new JLabel("Fahrenheit");
        fahrenheit.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField converted = new JTextField();
        converted.setMaximumSize(new Dimension(150,20));


        mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        convert.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createRigidArea(new Dimension(0,15)));
        mainPanel.add(mainLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(temperatures);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
       // mainPanel.add(toConvert);
        mainPanel.add(celsius);

        mainPanel.add(toConvert);
        mainPanel.add(Box.createRigidArea(new Dimension(0,10)));
        mainPanel.add(convert);
        mainPanel.add(Box.createRigidArea(new Dimension(0,10)));
        mainPanel.add(fahrenheit);
        mainPanel.add(converted);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));

        this.add(mainPanel);
        this.setVisible(true);


    }
}
