package com.company;

import jdk.internal.perf.Perf;
import sun.plugin2.message.GetAppletMessage;

/**
 * Created by Administrator on 9/12/2018.
 */
public class Cat {

    String name;
    String color;
    int weight, age;

    public void voice() {
        System.out.println("Murr");
    }

    public void getParam() {
        System.out.println("Cat parameters:");
        System.out.println("Name:" + name + "Color:" + color + ", Age" + age + ", Weight:" + weight);
    }
}
