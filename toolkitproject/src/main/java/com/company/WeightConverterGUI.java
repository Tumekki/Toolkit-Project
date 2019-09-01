package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JTextField leftInput = new JTextField("");
        leftInput.setHorizontalAlignment(JTextField.RIGHT);
        String[] weightChoices = {"Kilogram", "Pound", "Stone", "Ounce"};
        JComboBox leftTypes = new JComboBox(weightChoices);
        leftTypes.setSelectedIndex(0);
        leftPanel.add(leftInput);
        leftPanel.add(leftTypes);

        JTextField rightInput = new JTextField("");
        rightInput.setHorizontalAlignment(JTextField.RIGHT);
        String[] weightChoices2 = {"Kilogram", "Pound", "Stone", "Ounce"};
        JComboBox rightTypes = new JComboBox(weightChoices2);
        rightTypes.setSelectedIndex(1);
        rightPanel.add(rightInput);
        rightPanel.add(rightTypes);


        JButton equals = new JButton("=");
        equals.setFont(new Font("Arial", Font.PLAIN, 20));
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(leftTypes.getSelectedItem() == "Kilogram"){
                    if(rightTypes.getSelectedItem() == "Kilogram"){
                        rightInput.setText(leftInput.getText());
                    } else if(rightTypes.getSelectedItem() == "Pound"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp *= 2.205;
                        rightInput.setText(String.format("%.2f", temp));
                    } else if(rightTypes.getSelectedItem() == "Stone"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp /= 6.35;
                        rightInput.setText(String.format("%.2f", temp));
                    } else if(rightTypes.getSelectedItem() == "Ounce"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp *= 35.274;
                        rightInput.setText(String.format("%.2f", temp));
                    }
                } else if(leftTypes.getSelectedItem() == "Pound"){
                    if(rightTypes.getSelectedItem() == "Kilogram"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp /= 2.205;
                        rightInput.setText(String.format("%.2f", temp));
                    } else if(rightTypes.getSelectedItem() == "Pound"){
                        rightInput.setText(leftInput.getText());
                    }else if(rightTypes.getSelectedItem() == "Stone"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp /= 14;
                        rightInput.setText(String.format("%.2f", temp));
                    }else if(rightTypes.getSelectedItem() == "Ounce"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp *= 16;
                        rightInput.setText(String.format("%.2f", temp));
                    }

                } else if(leftTypes.getSelectedItem() == "Stone"){
                    if(rightTypes.getSelectedItem() == "Kilogram"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp *= 6.35;
                        rightInput.setText(String.format("%.2f", temp));
                    }else if(rightTypes.getSelectedItem() == "Pound"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp *= 14.0;
                        rightInput.setText(String.format("%.2f", temp));
                    }else if(rightTypes.getSelectedItem() == "Stone"){
                        rightInput.setText(leftInput.getText());
                    }else if(rightTypes.getSelectedItem() == "Ounce"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp *= 224;
                        rightInput.setText(String.format("%.2f", temp));
                    }
                } else if(leftTypes.getSelectedItem() == "Ounce"){
                    if(rightTypes.getSelectedItem() == "Kilogram"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp /= 35.274;
                        rightInput.setText(String.format("%.2f", temp));
                    }else if(rightTypes.getSelectedItem() == "Pound"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp /= 16.0;
                        rightInput.setText(String.format("%.2f", temp));
                    }else if(rightTypes.getSelectedItem() == "Stone"){
                        double temp = Double.parseDouble(leftInput.getText());
                        temp /= 224.0;
                        rightInput.setText(String.format("%.2f", temp));
                    }else if(rightTypes.getSelectedItem() == "Ounce"){
                        rightInput.setText(leftInput.getText());
                    }
                }
            }
        });

        mainPanel.add(Box.createRigidArea(new Dimension(0,30)));
        mainPanel.add(leftPanel);
        mainPanel.add(equals);
        mainPanel.add(rightPanel);


        this.add(mainPanel);
        this.setVisible(true);
    }
}
