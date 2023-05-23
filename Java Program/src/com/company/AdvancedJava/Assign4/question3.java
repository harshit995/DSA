package com.company.AdvancedJava.Assign4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class question3 extends JFrame implements MouseListener {
    private JButton button;
    private Random random;

    public question3() {
        // Set up the frame
        setTitle("Move Button");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null); // Use absolute positioning

        // Create the button
        button = new JButton("Click me!");
        button.setBounds(100, 50, 100, 30); // Set the button's initial position
        button.addMouseListener(this);
        add(button);

        // Show the frame
        setVisible(true);

        // Create the random number generator
        random = new Random();
    }

    public void mouseEntered(MouseEvent e) {
        // Move the button to a random position in the frame
        int x = random.nextInt(getWidth() - button.getWidth());
        int y = random.nextInt(getHeight() - button.getHeight());
        button.setLocation(x, y);
    }

    // These methods need to be implemented but can be empty
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}

    public static void main(String[] args) {
        // Create and show the frame
        new question3();
    }
}

