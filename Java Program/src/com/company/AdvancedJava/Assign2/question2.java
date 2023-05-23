package com.company.AdvancedJava.Assign2;

import java.awt.*;
import java.awt.event.*;
public class question2 {
    public static void main(String[] args) {
        Frame f = new Frame("Copy a text");
        f.setSize(400,400);

        TextField t1 = new TextField();
        t1.setBounds(30,160,110,30);
        f.add(t1);

        TextField t2 = new TextField();
        t2.setBounds(160,160,110,30);
        f.add(t2);

        Button b1 = new Button("Click");
        b1.setBounds(110,190,110,30);
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String t = t1.getText();
                t2.setText(t);

            }
        });

        f.setLayout(null);
        f.setVisible(true);
    }
}
