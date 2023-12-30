package com.bessonov.homework1.animals;

class Dog extends Animal {
    private static int count = 0;

    public Dog(String name) {
        super(name, "Dog", 200, 20);
        count++;
    }
}
