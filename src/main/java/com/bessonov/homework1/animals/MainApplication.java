package com.bessonov.homework1.animals;

public class MainApplication {
    public static void main(String[] args) {
        Animal[] animals = { new Cat("Murka"), new Dog("Bars"), new Tiger("Polosatik") };

        for (Animal ani : animals) {
            ani.swim(10);
            ani.run(100);
        }

        System.out.println(Animal.count);
    }
}
