package com.company.Assignment7;

public class Q2a {

        static class Counter {
            int count = 0;//will get memory each time when the instance is created

            Counter() {
                count++;//incrementing value
                System.out.println(count);
            }

            public static void main(String[] args) {

                Counter c1 = new Counter();
                Counter c2 = new Counter();
                Counter c3 = new Counter();
            }
        }
}
