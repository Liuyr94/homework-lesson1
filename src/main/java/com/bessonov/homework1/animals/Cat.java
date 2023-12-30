package com.bessonov.homework1.animals;

class Cat extends Animal {
    public static int count = 0;

    public Cat(String name) {
        super(name, "Cat", 150, -1);
        count++;
    }
}
