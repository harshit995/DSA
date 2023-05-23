package com.company.AdvancedJava.Assign4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class question2 extends JFrame implements ActionListener {
    private JLabel numberLabel;
    private Random random;

    public question2() {
        // Set up the frame
        setTitle("Question 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
//        setLayout(new FlowLayout());

        // Create a label and a button
        numberLabel = new JLabel();
        random = new Random();
        updateNumberLabel();
        add(numberLabel);
        JButton updateButton = new JButton("Click Me");

        updateButton.addActionListener(this);
        add(updateButton);
        updateButton.setBounds(200,100,100,30);
        // Show the frame
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        // Generate a new random number and update the label
        updateNumberLabel();
    }

    private void updateNumberLabel() {
        int number = random.nextInt(10) + 1; // Generates a random number between 1 and 10
        numberLabel.setText(Integer.toString(number));
    }

    public static void main(String[] args) {
        // Create and show the frame
        new question2();
    }
}
