package com.company.AdvancedJava;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapeDrawingApplet extends Applet
{
    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.white);

        // Set the foreground color (for shape outlines)
        g.setColor(Color.black);

        // Draw a rectangle
        g.drawRect(50, 50, 200, 100);

        // Fill a rectangle
        g.setColor(Color.blue);
        g.fillRect(300, 50, 200, 100);

        // Draw an oval
        g.setColor(Color.red);
        g.drawOval(50, 200, 200, 100);

        // Fill an oval
        g.setColor(Color.green);
        g.fillOval(300, 200, 200, 100);

        // Draw a line
        g.setColor(Color.orange);
        g.drawLine(50, 350, 550, 350);

        // Draw a polygon
        int[] xPoints = {400, 550, 550, 400};
        int[] yPoints = {400, 400, 550, 550};
        int numPoints = 4;
        g.setColor(Color.magenta);
        g.drawPolygon(xPoints, yPoints, numPoints);

        // Fill a polygon
        g.setColor(Color.yellow);
        g.fillPolygon(xPoints, yPoints, numPoints);
    }
}
