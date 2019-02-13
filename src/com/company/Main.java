package com.company;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d = new Dog();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

    }

    private static void print(String a) {
        System.out.println(a);
    }
}





