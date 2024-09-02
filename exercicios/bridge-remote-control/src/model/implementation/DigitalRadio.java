package model.implementation;

public class DigitalRadio extends Device {
    private String modulation;

    public DigitalRadio() {
        super();
        this.modulation = "FM";
    }

    public DigitalRadio(boolean on, int volume, int channel, String modulation) {
        super(on, volume, channel);
        this.modulation = modulation;
    }

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @Override
    public void printStatus() {
        System.out.println("------ Radio Status ------");
        System.out.println("Power: " + (isEnabled() ? "On" : "Off"));
        System.out.println("Volume: " + getVolume());
        System.out.println("Channel: " + getChannel());
        System.out.println("Modulation: " + modulation);
        System.out.println("--------------------------");
    }
}
