package com.company.AdvancedJava.Assign1;

import java.awt.*;
public class ques1 extends Frame {
        public ques1(){
            Label l1 = new Label("Hello VIT");
            l1.setBounds(90,90,90,90);
            setSize(430,430);
            add(l1);
            setLayout(null);
            setVisible(true);

        }
        public static void main(String[] args)
        {
            ques1 h1 = new ques1();
        }

    }
