package com.company.AdvancedJava.Assign2;

import java.awt.*;
import java.awt.event.*;

public class question4 extends Frame implements ActionListener {
    private Label label;
    private TextField textField;
    private Button button;

    public question4() {
        super("Factorial Calculator");

        label = new Label("Enter a number:");
        textField = new TextField(10);
        button = new Button("Calculate");
        button.addActionListener(this);

        setLayout(new FlowLayout());
        add(label);
        add(textField);
        add(button);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        int num = Integer.parseInt(input);

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        String result = "The factorial of the number you entered is: " + factorial;
        Dialog dialog = new Dialog(this, "Result", true);
        Label label = new Label(result);
        dialog.add(label);
        dialog.pack();
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new question4();
    }
}
