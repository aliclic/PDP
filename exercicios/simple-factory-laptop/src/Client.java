import service.LaptopFactory;

public class Client {
    public static void main(String[] args) {
        var gaming = LaptopFactory.createLaptop("gaming");
        var normal = LaptopFactory.createLaptop("normal");
        var nulo = LaptopFactory.createLaptop(null);

        gaming.runTests();
        normal.runTests();
        nulo.runTests();
    }
}
