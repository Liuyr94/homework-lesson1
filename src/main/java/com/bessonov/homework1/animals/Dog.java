package com.bessonov.homework1.animals;

class Dog extends Animal {
    private static int count = 0;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    @Override
    public void animalsCreated() {
        System.out.println(count + " собак создано");
    }

    @Override
    public void info() {
        System.out.println("Это собака и вот что мы о нём знаем: \n1.Имя животного - " + name + ".\n2.Цвет животного " +
                "-" +
                " " + color +
                ".\n.3.Лет " +
                "животному - " + age + ".");
    }

    @Override
    public void run(int runningRange) {
        if (runningRange < 0) {
            System.out.println("Собака не может пробежать меньше отрицательное количество метров");
            return;
        }

        if (runningRange > 500) {
            System.out.println("Собака не может пробежать больше 500 метров");
            return;
        } else {
            System.out.println("Наша собака по имени " + name + " пробежала " + runningRange);
        }
    }

    @Override
    public void swim(int cruisingRange) {
        if (cruisingRange < 0) {
            System.out.println("Собака не может пробежать проплыть отрицательное количество метров");
            return;
        }

        if (cruisingRange > 10) {
            System.out.println("Собака не может проплыть больше 10 метров");
        } else {
            System.out.println("Наша собака по имени " + name + " проплыла " + cruisingRange);
        }
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
