package com.java24hours;

import javax.swing.*;

public class SalutonFrame extends JFrame {

    public SalutonFrame() {
        super("Saluton Mundo!");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch(Exception e){
        }
    }
    
    public static void main(String[] args) {
        SalutonFrame frame = new SalutonFrame();
    }
}
