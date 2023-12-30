package com.bessonov.homework1.animals;

public abstract class Animal {
    public static int count = 0;
    String name;
    String type;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int runDistance) {
        if (maxRunDistance < runDistance) {
            System.out.println(type + " не смог пробежать " + runDistance);
            return;
        }
        if (runDistance <= 0) {
            System.out.println("Надо задать значение больше нуля");
            return;
        } else {
            System.out.println(type + " пробежал " + runDistance);
        }
    }

    public void swim(int swimDistance) {
        if (maxSwimDistance < swimDistance) {
            System.out.println(type + " не смог проплыть " + swimDistance);
            return;
        }
        if (swimDistance <= 0) {
            System.out.println("Надо задать значение больше нуля");
            return;
        } else {
            System.out.println(type + " проплыл " + swimDistance);
        }
    }

}
