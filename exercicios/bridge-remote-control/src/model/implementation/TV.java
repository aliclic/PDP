package model.implementation;

public class TV extends Device {
    private boolean smartv;

    public TV(boolean on, int volume, int channel, boolean smartv) {
        super(on, volume, channel);
        this.smartv = smartv;
    }

    public void smartvOn() {
        this.smartv = true;
    }

    public void smartvOff() {
        this.smartv = false;
    }

    @Override
    public void printStatus() {
        System.out.println("------ TV Status ------");
        System.out.println("Power: " + (isEnabled() ? "On" : "Off"));
        System.out.println("Volume: " + getVolume());
        System.out.println("Channel: " + getChannel());
        System.out.println("Smart TV: " + (smartv ? "Yes" : "No"));
        System.out.println("-----------------------");
    }
}
