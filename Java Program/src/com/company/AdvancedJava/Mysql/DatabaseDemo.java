package com.company.AdvancedJava.Mysql;// package com.company.AdvancedJava.Mysql;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DatabaseDemo extends Frame implements ActionListener {
    private TextField nameField, ageField, areaField, phoneField;
    private Button addButton, updateButton, deleteButton;
    private Label messageLabel;
    private Connection connection;

    public DatabaseDemo() {
        super("Database Demo");

        // Create text fields
        nameField = new TextField(20);
        ageField = new TextField(20);
        areaField = new TextField(20);
        phoneField = new TextField(20);

        // Create buttons
        addButton = new Button("Add");
        addButton.addActionListener(this);
        updateButton = new Button("Update");
        updateButton.addActionListener(this);
        deleteButton = new Button("Delete");
        deleteButton.addActionListener(this);

        // Create message label
        messageLabel = new Label("");

        // Add components to window
        setLayout(new GridLayout(4, 2));
        add(new Label("Name:"));
        add(nameField);
        add(new Label("Age:"));
        add(ageField);
        add(new Label("Area:"));
        add(areaField);
        add(new Label("Phone:"));
        add(phoneField);
        add(addButton);
        add(updateButton);
        add(deleteButton);
        add(messageLabel);
//        System.out.println("hiii");
        // Connect to MySQL database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("hiii");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
            System.out.println("hello...");
        } catch (Exception ex) {
            messageLabel.setText("Error connecting to database: " + ex.getMessage());
        }

        // Set window size and visibility
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Statement statement = connection.createStatement();
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String area = areaField.getText();
            int phone = Integer.parseInt(phoneField.getText());

            if (e.getSource() == addButton) {
                statement.executeUpdate("INSERT INTO mytable (name, age, area,phone) VALUES ('" + name + "', " + age
                        + ", " + phone + ", " + area + ")");
                messageLabel.setText("Record added successfully");
            } else if (e.getSource() == updateButton) {
                statement.executeUpdate("UPDATE mytable SET name = '" + name + "', age = " + age + " WHERE area = "
                        + area + ", " + phone);
                messageLabel.setText("Record updated successfully");
            } else if (e.getSource() == deleteButton) {
                statement.executeUpdate("DELETE FROM mytable WHERE phone = " + phone);
                messageLabel.setText("Record deleted successfully");
            }
        } catch (Exception ex) {
            messageLabel.setText("Error performing operation: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new DatabaseDemo();
    }
}