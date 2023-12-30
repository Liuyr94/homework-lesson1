package com.bessonov.homework1.animals;

import java.util.Objects;

public abstract class Animal {
    public static int count = 0;
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public void animalsCreated() {
        System.out.println(count + " Животных создано");
    }

    public void info() {
        System.out.println("Имя животного - " + name + ".\nЦвет животного - " + color + ".\n.Лет животному - " + age + ".");
    }

    public abstract void run(int runningRange);

    public abstract void swim(int cruisingRange);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name) && color.equals(animal.color) && age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}
