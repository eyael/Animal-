package com.company;

public class Cat extends Animal {
    /*
     * All Cats are Animals but all Animals are not Cats
     */
    public Cat() {
            super();
            System.out.println("Now I am a Cat!");
        }


        public String sleep() {
            return "A cat sleeps...";
        }


        public String eat() {
            return "A cat eats...";
        }

        public String purr() {
            return "purrr...";
        }

    }

