package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {
    public CalculatorGUI(){

            this.setSize(400,400);
            this.setLocationRelativeTo(null);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension dim = tk.getScreenSize();
            int xPos = (dim.width/2) - (this.getWidth() / 2);
            int yPos = (dim.height/2) - (this.getHeight() / 2);

            this.setLocation(xPos, yPos);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Calculator");


        JPanel mainPanel = new JPanel();
        JTextField numField = new JTextField();
        numField.setHorizontalAlignment(JTextField.RIGHT);
        numField.setPreferredSize(new Dimension(250,30));
        numField.setMaximumSize(new Dimension(250,30));


        JTextField answerField = new JTextField();
        answerField.setHorizontalAlignment(JTextField.RIGHT);
        answerField.setPreferredSize(new Dimension(250,20));
        answerField.setMaximumSize(new Dimension(250,30));


        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JButton button;
        pane.setLayout(new GridBagLayout());


        button = new JButton("1");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("4");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("6");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("7");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(button, c);

        button = new JButton("8");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(button, c);

        button = new JButton("9");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(button, c);



        JPanel numPanel = new JPanel();
        numPanel.setLayout(new BoxLayout(numPanel, BoxLayout.PAGE_AXIS));
        numPanel.add(numField);
        numPanel.add(answerField);
        //mainPanel.add(numField);
        //mainPanel.add(answerField);

        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        container.add(numPanel);
        container.add(pane);

        this.add(container);

        this.setVisible(true);
        }
    }


