package com.company.AdvancedJava.Assign1;

import java.awt.Frame;
import java.awt.*;
    public class ques4 extends Frame {
        public ques4() {
            setSize(600, 600);
            Label l1 = new Label("Choose Your Favorite Language:");
            l1.setBounds(110, 160, 210, 40);
            Choice ch = new Choice();
            ch.setBounds(110, 220, 60, 40);
            ch.add("Java");
            ch.add("C/C++");
            ch.add("Python");
            ch.add("C#");
            add(l1);
            add(ch);
            setLayout(null);
            setVisible(true);
        }
        public static void main(String[] args) {
            ques4 obj = new ques4();
        }

    }
