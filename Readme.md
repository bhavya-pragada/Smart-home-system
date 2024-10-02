# File Descriptions

## 1. AutomatedTrigger.java
Represents a condition that triggers an action based on certain parameters (like temperature thresholds).
Contains fields for condition, comparison operator, value, and action, with getters for each.

## 2. DoorLock.java
A class that extends SmartDevice, representing a door lock.
Overrides the getDeviceType() method to return "Door Lock".

## 3. Light.java
A class that extends SmartDevice, representing a light.
Overrides the getDeviceType() method to return "Light".

## 4. Main.java
The main entry point of the program.
Contains a menu-driven console interface for interacting with the smart home system (e.g., adding devices, turning them on/off, setting schedules).

## 5. ScheduledTask.java
Represents a scheduled task that includes a device ID, time, and command to be executed at a specified time.

## 6. SmartDevice.java
An abstract class that represents a general smart device.
Contains common fields (like ID and status) and methods for turning devices on/off, with an abstract method for getting the device type.

## 7. SmartHomeSystem.java
The core class that manages all smart devices, scheduled tasks, and automated triggers.
Provides methods for adding/removing devices, turning them on/off, setting schedules, and executing automated triggers based on conditions.

## 8. Thermostat.java
A class that extends SmartDevice, representing a thermostat.
Contains a temperature field and methods to get/set the temperature, along with overridden methods for device type and status reporting.
