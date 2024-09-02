package model.abstraction;

import model.implementation.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Muting the device");
        device.setVolume(0);
        device.printStatus();
    }
}
