package com.java24hours;

import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {

    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public Crisis() {
        super("Crisis");
        //setLookAndFeel
        setSize(348, 128);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        dontPanicButton = new JButton("Don't Panic");
        panicButton = new JButton("Panic");
        blameButton = new JButton("Blame Others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        add(panicButton);
        add(dontPanicButton);
        add(blameButton);
        add(mediaButton);
        add(saveButton);
        setVisible(true);
    }

    //private void setLookAndFeel
    public static void main(String[] args) {
        Crisis frame = new Crisis();
    }
}
