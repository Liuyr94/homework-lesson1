package com.bessonov.homework1.animals;

class Cat extends Animal {
    private static int count = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    @Override
    public void animalsCreated() {
        System.out.println(count + " котов создано создано");
    }

    @Override
    public void info() {
        System.out.println("Это кот и вот что мы о нём знаем: \n1.Имя животного - " + name + ".\n2.Цвет животного - " + color +
                ".\n.3.Лет " +
                "животному - " + age + ".");
    }

    @Override
    public void run(int runningRange) {
        if (runningRange < 0) {
            System.out.println("Кот не может пробежать отрицательное количество метров)))");
            return;
        }
        if (runningRange > 200) {
            System.out.println("Кот не может пробежать больше 200 метров(((");
            return;
        } else {
            System.out.println("Кот пробежал " + runningRange);
        }
    }

    @Override
    public void swim(int cruisingRange) {
        System.out.println("Кот не умеет плавать((");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
