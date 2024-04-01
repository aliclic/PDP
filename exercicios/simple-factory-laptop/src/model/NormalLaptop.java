package model;

import model.Laptop;

public class NormalLaptop implements Laptop {
    @Override
    public void runTests() {
        System.out.println(this.getClass());
    }
}
