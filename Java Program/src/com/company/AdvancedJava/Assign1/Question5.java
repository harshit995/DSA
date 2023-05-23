package com.company.AdvancedJava.Assign1;
import javax.swing.*;
import java.awt.*;
public class Question5 {
    public static void main(String[] args) {
        Frame f1 = new Frame();
        f1.setSize(600, 600);
        Label l1 = new Label("Select a Color:");
        l1.setBounds(110, 60, 180, 50);
        JRadioButton r1 = new JRadioButton("Red");
        JRadioButton r2 = new JRadioButton("Green");
        JRadioButton r3 = new JRadioButton("Blue");
        r1.setBounds(90, 110, 100, 40);
        r2.setBounds(90, 150, 100, 40);
        r3.setBounds(90, 190, 100, 40);
        f1.add(l1);
        f1.add(r1);
        f1.add(r2);
        f1.add(r3);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}