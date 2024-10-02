// SmartHomeSystem.java
import java.util.*;

public class SmartHomeSystem {
    private final Map<Integer, SmartDevice> devices = new HashMap<>();
    private final List<ScheduledTask> scheduledTasks = new ArrayList<>();
    private final List<Trigger> Triggers = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.put(device.getId(), device);
    }

    public void removeDevice(int deviceId) {
        devices.remove(deviceId);
    }

    public void turnOn(int deviceId) {
        SmartDevice device = devices.get(deviceId);
        if (device != null) device.turnOn();
    }

    public void turnOff(int deviceId) {
        SmartDevice device = devices.get(deviceId);
        if (device != null) device.turnOff();
    }

    public void setSchedule(int deviceId, String time, String command) {
        scheduledTasks.add(new ScheduledTask(deviceId, time, command));
    }

    public void addTrigger(String condition, String comparison, int value, String action) {
        Triggers.add(new Trigger(condition, comparison, value, action));
    }

    public void executeScheduledTasks(String currentTime) {
        for (ScheduledTask task : scheduledTasks) {
            if (task.getTime().equals(currentTime)) {
                executeCommand(task.getCommand(), task.getDeviceId());
            }
        }
    }

    public void executeTriggers(Map<String, Integer> currentConditions) {
        for (Trigger trigger : Triggers) {
            Integer conditionValue = currentConditions.get(trigger.getCondition());
            if (conditionValue != null && compare(conditionValue, trigger.getComparison(), trigger.getValue())) {
                executeCommand(trigger.getAction(), trigger.getValue());
            }
        }
    }

    private boolean compare(int a, String operator, int b) {
        switch (operator) {
            case ">": return a > b;
            case "<": return a < b;
            case "==": return a == b;
            default: return false;
        }
    }

    private void executeCommand(String command, int deviceId) {
        if (command.equalsIgnoreCase("turnOn")) turnOn(deviceId);
        else if (command.equalsIgnoreCase("turnOff")) turnOff(deviceId);
    }

    public String statusReport() {
        StringBuilder report = new StringBuilder();
        for (SmartDevice device : devices.values()) {
            report.append(device.getDeviceType()).append(" (ID: ").append(device.getId())
                    .append(") - Status: ").append(device.getStatus()).append("\n");
        }
        return report.toString();
    }
}
