import model.abstraction.AdvancedRemote;
import model.abstraction.BasicRemote;
import model.implementation.Device;
import model.implementation.DigitalRadio;
import model.implementation.TV;

public class ClientBridge {
    public void testDevice(Device device) {
        System.out.println("Testing with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Testing with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

    public static void main(String[] args) {
        ClientBridge client = new ClientBridge();

        Device tv = new TV(false, 20, 10, true);
        client.testDevice(tv);

        Device radio = new DigitalRadio(false, 30, 5, "FM");
        client.testDevice(radio);
    }
}
