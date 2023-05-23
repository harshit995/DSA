package com.company.AdvancedJava.Assign4;

import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;

public class question1 extends JFrame implements ActionListener {
    private JLabel timeLabel;

    public question1() {
        // Set up the frame
        setTitle("question 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create a panel with a label and a button
        JPanel panel = new JPanel();
        timeLabel = new JLabel();
        panel.add(timeLabel);
        JButton updateButton = new JButton("Update time by clicking");
        updateButton.setBounds(30,300,50,50);
        updateButton.addActionListener(this);
        panel.add(updateButton);
        add(panel);

        // Show the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Update the label with the current time
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        Date now = new Date();
        timeLabel.setText(dateFormat.format(now));
    }

    public static void main(String[] args) {
        // Create and show the frame
        new question1();
    }
}

