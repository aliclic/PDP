package model;

import model.Laptop;

public class GamingLaptop implements Laptop {
    @Override
    public void runTests() {
        System.out.println(this.getClass());
    }
}
