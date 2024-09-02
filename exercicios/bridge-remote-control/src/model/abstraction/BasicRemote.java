package model.abstraction;

import model.implementation.Device;

public class BasicRemote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void power() {
        System.out.println("Toggling power");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
        device.printStatus();
    }

    public void volumeDown() {
        System.out.println("Decreasing volume");
        device.setVolume(device.getVolume() - 10);
        device.printStatus();
    }

    public void volumeUp() {
        System.out.println("Increasing volume");
        device.setVolume(device.getVolume() + 10);
        device.printStatus();
    }

    public void channelDown() {
        System.out.println("Decreasing channel");
        device.setChannel(device.getChannel() - 1);
        device.printStatus();
    }

    public void channelUp() {
        System.out.println("Increasing channel");
        device.setChannel(device.getChannel() + 1);
        device.printStatus();
    }

    public Device getDevice() {
        return device;
    }

    public void setDevicde(Device device) {
        this.device = device;
    }
}
