package com.company.AdvancedJava.Assign1;

import java.awt.*;
    public class ques2 extends Frame {
        ques2(){
            TextField t1 = new TextField();
            t1.setBounds(40,60,60,30);
            TextField t2 = new TextField();
            t2.setBounds(40,80,60,30);
            Button b1 = new Button("Button");
            b1.setBounds(40,110,50,40);

            add(t1);
            add(t2);
            add(b1);
            setSize(450,450);
            setLayout(null);
            setVisible(true);
        }
        public static void main(String[] args) {
            ques2 obj = new ques2();
        }

    }
