package com.company.Assignment5;

public class Question1 {
    public static class Circle {
        /* The radius of this circle
         */
        double radius = 1;

        /*Construct a circle object
         */
        Circle() {
        }

        /* Construct a circle object
         */
        Circle(double newRadius) {
            radius = newRadius;
        }

        /* Return the area of this circle */
        double getArea() {
            return radius * radius * Math.PI;
        }

        /* Return the perimeter of this circle */
        double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        /* Set new radius for this circle
         */
        double setRadius(double newRadius) {
            radius = newRadius;
            return newRadius;
        }

        public static class TestArea{
            public static void main(String[] args) {

                Circle circle1=new Circle();
                circle1.setRadius(3);
                circle1.getArea();
                circle1.getPerimeter();

                System.out.println("The area is "+circle1.getArea());
            }
        }
    }

}
