package com.company.AdvancedJava.Assign1;

import java.awt.*;
public class Question3 {
        public static void main(String[] args) {
            Frame f1 = new Frame();
            f1.setSize(400,500);
            Label l1 = new Label("Enter your Name:");
            l1 .setBounds(25,110,90,40);

            TextField tx = new TextField();
            tx.setBounds(170,120,200,30);

            f1.add(l1);
            f1.add(tx);

            f1.setLayout(null);
            f1.setVisible(true);
        }
    }

