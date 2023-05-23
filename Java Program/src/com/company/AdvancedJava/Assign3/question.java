package com.company.AdvancedJava.Assign3;

import java.awt.*;
import java.awt.event.*;

public class question extends Frame implements Runnable, TextListener {
    private Thread thread;
    private TextArea textArea;
    private Label label;
    private int charCount;

    public question() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setTitle("Assignment");
        textArea = new TextArea();
        textArea.addTextListener(this);
        label = new Label("Character Typed: 0");
        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
        thread = new Thread(this);
        thread.start();

        setVisible(true);
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(100);

                label.setText("Character count: " + charCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void textValueChanged(TextEvent e) {
        charCount = textArea.getText().length();
    }

    public static void main(String[] args) {
        new question();
    }
}