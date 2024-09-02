package model.implementation;

public abstract class Device {
    private boolean on;
    private int volume;
    private int channel;

    public Device() {
        this.on = false;
        this.volume = 50;
        this.channel = 1;
    }

    public Device(boolean on, int volume, int channel) {
        this.on = on;
        this.volume = volume;
        this.channel = channel;
    }

    public boolean isEnabled() {
        return on;
    }

    public void enable() {
        on = true;
    }

    public void disable() {
        on = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String toString() {
        return "Device [on=" + on + ", volume=" + volume + ", channel=" + channel + "]";
    }

    public abstract void printStatus();
}
