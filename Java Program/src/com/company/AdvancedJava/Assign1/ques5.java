package com.company.AdvancedJava.Assign1;

import java.awt.*;
import javax.swing.JRadioButton;
    public class ques5 extends Frame {
        public ques5(){
            setSize(500,500);
            Label l1 = new Label("Select a Color:");
            l1.setBounds(100,50,150,30);
            JRadioButton r1 = new JRadioButton("Red");
            JRadioButton r2 = new JRadioButton("Green");
            JRadioButton r3 = new JRadioButton("Blue");
            r1.setBounds(90,110,100,50);
            r2.setBounds(90,150,100,50);
            r3.setBounds(90,190,100,50);
            add(l1);
            add(r1);
            add(r2);
            add(r3);
            setLayout(null);
            setVisible(true);
        }
        public static void main(String[] args) {
            ques5 obj = new ques5();
        }

    }
