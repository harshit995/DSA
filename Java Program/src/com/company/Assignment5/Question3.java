package com.company.Assignment5;
import java.util.Scanner;
public class Question3 {
    public static class ComplexTest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the first complex number: ");
            double realPart = input.nextDouble();

            System.out.println("Enter the second complex number: ");
            double imaginaryPart = input.nextDouble();

            Complex cn1 = new Complex(realPart, imaginaryPart);
            Complex cn2 = new Complex(realPart);
            Complex cn3 = new Complex();

            if (realPart == 0) {
                System.out.println(cn3.toString());
            }
            if (imaginaryPart == 0) {
                System.out.println(cn2.toString());
            }
            if (realPart != 0 && imaginaryPart != 0) {
                System.out.println(cn1.toString());
            }
        }
    }
    public static class Complex {

        // cloneable interface
        public interface Cloneable {
        }

        // Instance Real + Getters and Setters (Accessors and Mutators)
        private double realPart;

        public double getReal() {
            return realPart;
        }

        public void setReal(double real) {
            this.realPart = real;
        }

        // Instance Real + Getters and Setters (Accessors and Mutators)

        private double imaginaryPart;

        public double getImaginary() {
            return imaginaryPart;
        }

        public void setImaginary(double imaginary) {
            this.imaginaryPart = imaginary;
        }

        // Constructor Method CN1
        public Complex(double a, double b) {
            realPart = a;
            imaginaryPart = b;
        }

        // Constructor Method CN2
        public Complex(double a) {
            realPart = a;
            imaginaryPart = 0;
        }

        // Constructor Method CN3
        public Complex() {
        }

        // Add Complex Numbers
        public Complex add(Complex comp1, Complex comp2) {
            double real1 = comp1.getReal();
            double real2 = comp2.getReal();
            double imaginary1 = comp1.getImaginary();
            double imaginary2 = comp2.getImaginary();

            return new Complex(real1 + real2, imaginary1 + imaginary2);
        }
        // Subtract Complex Numbers
        public Complex subtract(Complex comp1, Complex comp2) {
            double real1 = comp1.getReal();
            double real2 = comp2.getReal();
            double imaginary1 = comp1.getReal();
            double imaginary2 = comp2.getReal();

            return new Complex(real1 - real2, imaginary1 - imaginary2);
        }

        // Multiply Complex Numbers
        public Complex multiply(Complex comp1, Complex comp2) {
            double real1 = comp1.getReal();
            double real2 = comp2.getReal();
            double imaginary1 = comp1.getReal();
            double imaginary2 = comp2.getReal();

            return new Complex(real1 * real2, imaginary1 * imaginary2);
        }

        // Divide Complex Numbers
        public Complex divide(Complex comp1, Complex comp2) {
            double real1 = comp1.getReal();
            double real2 = comp2.getReal();
            double imaginary1 = comp1.getReal();
            double imaginary2 = comp2.getReal();

            return new Complex(real1 / real2, imaginary1 / imaginary2);
        }

        // toString to Change Display
        public String toString() {
            String result;
            result = realPart + " + " + imaginaryPart + "i";

            return result;
        }


    }
}