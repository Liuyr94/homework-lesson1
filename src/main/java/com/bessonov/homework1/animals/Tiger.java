package com.bessonov.homework1.animals;

class Tiger extends Animal {
    private static int count = 0;

    public Tiger(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    @Override
    public void animalsCreated() {
        System.out.println(count + " тигров создано");
    }


    @Override
    public void info() {
        System.out.println("Это тигр и вот что мы о нём знаем: \n1.Имя животного - " + name + ".\n2.Цвет животного - " + color +
                ".\n.3.Лет " +
                "животному - " + age + ".");
    }

    @Override
    public void run(int runningRange) {
        if (runningRange < 0) {
            System.out.println("Тигр не умеет отрицательно бегать((");
        }
        if (runningRange > 150) {
            System.out.println("Тигр не сможет пробежать больше(((");
        } else {
            System.out.println("Тигр пробежал " + runningRange);
        }
    }

    @Override
    public void swim(int cruisingRange) {
        if (cruisingRange < 0) {
            System.out.println("Тигр не умеет отрицательно плавать");
            return;
        }
        if (cruisingRange > 6000) {
            System.out.println("Тигр не может проплыть свыше 6000 метров.");
        } else {
            System.out.println("Тигр проплыл " + cruisingRange);
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
