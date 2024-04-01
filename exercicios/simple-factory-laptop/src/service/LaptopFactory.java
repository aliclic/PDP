package service;

import model.GamingLaptop;
import model.Laptop;
import model.NormalLaptop;
import model.NullLaptop;

public class LaptopFactory {
    public static Laptop createLaptop(String laptop) {
        if (laptop == null)
            return new NullLaptop();

        return switch (laptop.toLowerCase()) {
            case "gaming" -> new GamingLaptop();
            case "normal" -> new NormalLaptop();
            default -> new NullLaptop();
        };
    }
}
