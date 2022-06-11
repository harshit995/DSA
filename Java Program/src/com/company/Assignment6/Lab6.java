package com.company.Assignment6;



    abstract class Feline extends Animal {
        public void flook() {
            System.out.println("Animals should look like cat");
        }
    }

    abstract class Animal {
    public void eat() {
        System.out.println("Animal should eat");
        }
    }

    abstract class Canine extends Animal {
        public void clook() {
            System.out.println("Animals should look like dog");
        }
    }

    interface Pet {
        public default void play() {
            System.out.println("Pets like to play");
        }

        public default void beFriendly() {
            System.out.println("Pets behave nicely to people");
        }
    }

    public class Lab6 {
        static class Dog extends Canine implements Pet {
        }
        static class Cat extends Feline implements Pet {
        }
        static  class Wolf extends Canine {
        }
        static  class Hippo extends Animal {
        }
        static  class Tiger extends Feline {
        }
        static  class Lion extends Feline {
        }

        public static void main(String[] args) {
            System.out.println("Cat");
            Cat c = new Cat();
            c.flook();
            c.beFriendly();
            c.play();
            c.eat();

            Dog d = new Dog();
            System.out.println("Dogs");
            d.clook();
            d.beFriendly();
            d.play();
            d.eat();
            System.out.println("Hippo");
            Hippo h = new Hippo();
            h.eat();

            System.out.println("Lion");
            Lion l = new Lion();
            l.flook();
            l.eat();

            System.out.println("Tiger");
            Tiger t = new Tiger();
            t.flook();
            t.eat();
            System.out.println("Wolf");
            Wolf w = new Wolf();
            w.clook();
            w.eat();
        }}



