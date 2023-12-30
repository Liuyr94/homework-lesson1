package com.bessonov.homework1.animals;

public class MainApplication {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Tiger", "blue", 8);
        Animal cat = new Cat("Cat", "white", 2);
        Animal dog = new Dog("Dog", "black", 12);
        Animal[] animals = new Animal[3];
        animals[0] = tiger;
        animals[1] = cat;
        animals[2] = dog;
        System.out.println();


        for (Animal ani : animals) {
            ani.run(100);
            ani.swim(118);
            System.out.println();
        }
        System.out.println();

        System.out.println(Animal.count);
    }
}
