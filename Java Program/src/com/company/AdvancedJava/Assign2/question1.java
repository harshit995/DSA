package com.company.AdvancedJava.Assign2;
import java.awt.*;
import java.awt.event.*;
public class question1{
    public static void main(String[] args) {
        Frame f = new Frame("Square");
        f.setSize(400,400);

        Label l1 = new Label("Enter a Number:");
        l1.setBounds(30,160,110,30);
        f.add(l1);


        Label l2 = new Label();
        l2.setBounds(20,250,300,20);
        f.add(l2);

        TextField tx = new TextField();
        tx.setBounds(160,160,210,30);
        f.add(tx);

        Button b1 = new Button("Click");
        b1.setBounds(110,190,110,30);
        f.add(b1);

        // function to a button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String a = tx.getText();
                int b = Integer.parseInt(a);
                int c = 0;
                if(e.getSource() == b1){
                    c = b * b;
                }
                String res = String.valueOf(c);
                l2.setText("The square of the number you entered is: "+res);
            }
        });

        f.setLayout(null);
        f.setVisible(true);
    }
}
