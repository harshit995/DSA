package com.company.AdvancedJava.Assign4;

import javax.swing.*;
import java.awt.*;

public class question4 extends JFrame {
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextArea textArea;

    public question4() {
        setTitle("Text Input");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        // Text Field
        JPanel textFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel textFieldLabel = new JLabel("Name:");
        textFieldPanel.add(textFieldLabel);
        textField = new JTextField(20);
        textFieldPanel.add(textField);
        panel.add(textFieldPanel);

        // Password Field
        JPanel passwordFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel passwordFieldLabel = new JLabel("PIN:");
        passwordFieldPanel.add(passwordFieldLabel);
        passwordField = new JPasswordField(20);
        passwordFieldPanel.add(passwordField);
        panel.add(passwordFieldPanel);

        // Text Area with Scroll Pane
        JPanel textAreaPanel = new JPanel(new BorderLayout());
        JLabel textAreaLabel = new JLabel("paragraph:");
        textAreaPanel.add(textAreaLabel, BorderLayout.NORTH);
        textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textAreaPanel.add(scrollPane, BorderLayout.CENTER);
        panel.add(textAreaPanel);

        add(panel);
    }

    public static void main(String[] args) {
        question4 frame = new question4();
        frame.setVisible(true);
    }
}

