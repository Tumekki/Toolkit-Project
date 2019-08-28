package com.company;

import javax.swing.*;
import java.awt.*;

public class WeightConverterGUI extends JFrame{
    public WeightConverterGUI(){

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






        this.setVisible(true);
    }
}
