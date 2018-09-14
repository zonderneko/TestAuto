package com.company;

import java.util.Random;

public class Cycle {
    int i, x;

    public static void randmurr() {
        Random Rand = new Random(System.currentTimeMillis());
        int x = Rand.nextInt(10);
        System.out.print("Cat says: ");
        for (int i = 0; i < x; i++)
            System.out.print("murr ");
    }
}
