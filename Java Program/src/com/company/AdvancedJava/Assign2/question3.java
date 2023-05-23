package com.company.AdvancedJava.Assign2;

import java.awt.*;
import java.awt.event.*;
public class question3 {
    public static void main(String[] args) {
        Frame f = new Frame("Length of a String");
        f.setSize(500,500);

        Label l = new Label("Enter Your String:");
        l.setBounds(40,120,90,20);
        f.add(l);

        Label l1 = new Label();
        l1.setBounds(30,50,200,20);
        f.add(l1);

        TextField t1 = new TextField();
        t1.setBounds(190,120,100,20);
        f.add(t1);

        Button b1 = new Button("Click");
        b1.setBounds(50,150,100,20);
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String tx = t1.getText();
                int len = tx.length();
                String s = String.valueOf(len);
                l1.setText("Length of a String is : "+s);


            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
}