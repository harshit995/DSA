package com.company.AdvancedJava.Assign1;

import java.awt.*;
public class Question2 {
        public static void main(String[] args) {
            Frame f1 = new Frame();
            TextField t1 = new TextField();
            t1.setBounds(50,50,60,30);
            TextField t2 = new TextField();
            t2.setBounds(60,70,70,30);
            Button b1 = new Button("Button");
            b1.setBounds(70,100,50,30);

            f1.add(t1);
            f1.add(t2);
            f1.add(b1);
            f1.setSize(500,500);
            f1.setLayout(null);
            f1.setVisible(true);

        }

}
