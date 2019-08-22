package com.company;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;


public class GUI extends JFrame{

    public GUI(){
        this.setSize(800,400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width/2) - (this.getWidth() / 2);
        int yPos = (dim.height/2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Toolkit");
    }
}
