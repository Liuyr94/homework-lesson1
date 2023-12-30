package com.bessonov.homework1.animals;

class Tiger extends Animal {
    private static int count = 0;

    public Tiger(String name) {
        super(name, "Tiger", 200, 5000);
        count++;
    }
}
