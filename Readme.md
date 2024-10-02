# File Descriptions

AutomatedTrigger.java
Represents a condition that triggers an action based on certain parameters (like temperature thresholds).
Contains fields for condition, comparison operator, value, and action, with getters for each.

DoorLock.java
A class that extends SmartDevice, representing a door lock.
Overrides the getDeviceType() method to return "Door Lock".

Light.java
A class that extends SmartDevice, representing a light.
Overrides the getDeviceType() method to return "Light".

Main.java
The main entry point of the program.
Contains a menu-driven console interface for interacting with the smart home system (e.g., adding devices, turning them on/off, setting schedules).

README.md
A markdown file providing an overview of the project, installation instructions, and usage details. (You can fill this in with relevant information for your project.)

ScheduledTask.java
Represents a scheduled task that includes a device ID, time, and command to be executed at a specified time.

SmartDevice.java
An abstract class that represents a general smart device.
Contains common fields (like ID and status) and methods for turning devices on/off, with an abstract method for getting the device type.

SmartHomeSystem.java
The core class that manages all smart devices, scheduled tasks, and automated triggers.
Provides methods for adding/removing devices, turning them on/off, setting schedules, and executing automated triggers based on conditions.

Thermostat.java
A class that extends SmartDevice, representing a thermostat.
Contains a temperature field and methods to get/set the temperature, along with overridden methods for device type and status reporting.
