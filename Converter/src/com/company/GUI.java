package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.xml.ws.Action;


public class GUI extends JFrame{

    public GUI(){
        Converter newConverter = new Converter();

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

        JLabel label1 = new JLabel("Celsius");
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField toConvert = new JTextField();
        toConvert.setMaximumSize(new Dimension(150,20));


        JButton convert = new JButton("=");
        JLabel label2 = new JLabel("Fahrenheit");
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField converted = new JTextField();
        converted.setMaximumSize(new Dimension(150,20));

        //Add a listener to the option box so that the celsius and fahrenheit labels swap places depending on
        //the converted and convertable
        temperatures.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(temperatures.getSelectedItem() == "Celsius to Fahrenheit"){
                    label1.setText("Celsius");
                    label2.setText("Fahrenheit");
                } else if(temperatures.getSelectedItem() == "Fahrenheit to Celsius") {
                    label1.setText("Fahrenheit");
                    label2.setText("Celsius");
                }
            }
        });

        //Add functionality to the "=" button.
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(temperatures.getSelectedItem() == "Celsius to Fahrenheit"){
                    String temp = toConvert.getText();
                    newConverter.setConvertable(Double.parseDouble(temp));
                    double temp2 = newConverter.toFahrenheit(newConverter.getConvertable());
                    converted.setText(Double.toString(temp2));
                }
            }
        });


        mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        convert.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createRigidArea(new Dimension(0,15)));
        mainPanel.add(mainLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(temperatures);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(label1);

        mainPanel.add(toConvert);
        mainPanel.add(Box.createRigidArea(new Dimension(0,10)));
        mainPanel.add(convert);
        mainPanel.add(Box.createRigidArea(new Dimension(0,10)));
        mainPanel.add(label2);
        mainPanel.add(converted);
        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));

        this.add(mainPanel);
        this.setVisible(true);


    }
}
