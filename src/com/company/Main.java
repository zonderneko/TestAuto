package com.company;

public class Main {

    public static void main(String[] args) {
        Cat Petrovi4 = new Cat();
        Petrovi4.name = "Petrovi4";
        Petrovi4.age = 2;
        Petrovi4.weight = 6;
        Petrovi4.color = "red";
        Petrovi4.voice();
        Petrovi4.getParam();
        Cat Zhora = new Cat("Zhora", 3, "brown", 6);
        Zhora.getParam();
        Zhora.voice();
        BadCat as = new BadCat();
        as.voice();
        Cycle.randmurr();
    }
}
