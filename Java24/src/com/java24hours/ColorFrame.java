package com.java24hours;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorFrame extends JFrame {

    JButton red, green, blue;

    public ColorFrame() {
        super("ColorFrame");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);

        ActionListener act = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == red) {
                    getContentPane().setBackground(Color.red);
                }
                if (event.getSource() == blue) {
                    getContentPane().setBackground(Color.blue);
                }
                if (event.getSource() == green) {
                    getContentPane().setBackground(Color.green);
                }
            }
        };
        red.addActionListener(act);
        blue.addActionListener(act);
        green.addActionListener(act);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ColorFrame();
    }
}
