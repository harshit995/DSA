package com.company.AdvancedJava.Assign1;

import java.awt.*;
public class Question4 {
        public static void main(String[] args) {
            Frame f1 = new Frame();
            f1.setSize(600,600);
            Label l1 = new Label("Choose Your Favorite Language:");
            l1.setBounds(110,180,300,40);
            Choice ch = new Choice();
            ch.setBounds(110,280,70,50);
            ch.add("Java");
            ch.add("C/C++");
            ch.add("Python");
            ch.add("C#");

            f1.add(l1);
            f1.add(ch);

            f1.setLayout(null);
            f1.setVisible(true);

        }

}
