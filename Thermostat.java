// Thermostat.java
public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id, int temperature) {
        super(id, "On");
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getDeviceType() {
        return "Thermostat";
    }

    @Override
    public String getStatus() {
        return "Temperature: " + temperature + "°C, " + super.getStatus();
    }
}
