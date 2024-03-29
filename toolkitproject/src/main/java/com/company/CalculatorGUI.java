package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    Calculator calc = new Calculator();
    public CalculatorGUI(){

            this.setSize(400,300);
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

        //numField is the textfield that displays the user's input
        JTextField numField = new JTextField();
        numField.setHorizontalAlignment(JTextField.RIGHT);
        numField.setPreferredSize(new Dimension(300,30));
        numField.setMaximumSize(new Dimension(300,30));


        //answerField is the textfield that will show the answer once '=' is clicked
        JTextField answerField = new JTextField();
        answerField.setHorizontalAlignment(JTextField.RIGHT);
        answerField.setPreferredSize(new Dimension(300,30));
        answerField.setMaximumSize(new Dimension(300,30));

        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JButton button;
        pane.setLayout(new GridBagLayout());

        //Buttons for numbers and operators in a gridbag layout
        button = new JButton("7");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("7"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("8");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("8"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("9");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("9"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("+");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 0;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setNum1(Double.parseDouble(calc.getCalculation()));
                calc.setCalculation(calc.getCalculation().concat("+"));
                numField.setText(calc.getCalculation());
                calc.setCalculation("");
                calc.setOperator("+");
            }
        });

        button = new JButton("4");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("4"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("5"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("6");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("6"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 1;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setNum1(Double.parseDouble(calc.getCalculation()));
                calc.setCalculation(calc.getCalculation().concat("-"));
                numField.setText(calc.getCalculation());
                calc.setCalculation("");
                calc.setOperator("-");
            }
        });

        button = new JButton("1");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("1"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("2"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("3"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("x");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 2;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setNum1(Double.parseDouble(calc.getCalculation()));
                calc.setCalculation(calc.getCalculation().concat("x"));
                numField.setText(calc.getCalculation());
                calc.setCalculation("");
                calc.setOperator("x");
            }
        });

        button = new JButton("0");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("0"));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton(".");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation(calc.getCalculation().concat("."));
                numField.setText(calc.getCalculation());
            }
        });

        button = new JButton("=");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 3;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setNum2(Double.parseDouble(calc.getCalculation()));
                double temp = calc.calculate(calc.getNum1(), calc.getNum2());
                calc.setResult(Double.toString(temp));
                answerField.setText(calc.getResult());
            }
        });

        button = new JButton("%");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 3;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setNum1(Double.parseDouble(calc.getCalculation()));
                calc.setCalculation(calc.getCalculation().concat("%"));
                numField.setText(calc.getCalculation());
                calc.setCalculation("");
                calc.setOperator("%");
            }
        });

        button = new JButton("CE");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setCalculation("");
                numField.setText(calc.getCalculation());
                calc.setResult("");
                answerField.setText(calc.getResult());
            }
        });

        button = new JButton("Back");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 4;
        pane.add(button, c);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu menu = new MainMenu();
                dispose();
            }
        });


        JPanel numPanel = new JPanel();
        numPanel.setLayout(new BoxLayout(numPanel, BoxLayout.PAGE_AXIS));
        numPanel.add(numField);
        numPanel.add(answerField);


        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        container.add(numPanel);
        container.add(pane);

        this.add(container);

        this.setVisible(true);
        }
    }