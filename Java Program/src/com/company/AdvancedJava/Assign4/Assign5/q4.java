package com.company.AdvancedJava.Assign4.Assign5;

import java.awt.*;
import javax.swing.*;

public class q4 extends JFrame {
    private JLabel nameLabel, emailLabel, phoneLabel;
    private JTextField nameField, emailField, phoneField;
    private JButton submitButton;

    public q4() {
        super("Contact Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        phoneLabel = new JLabel("Phone Number:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);

        submitButton = new JButton("Submit");

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(submitButton);

        add(formPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new q4();
    }
}

