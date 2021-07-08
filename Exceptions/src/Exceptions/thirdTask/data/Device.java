package Exceptions.thirdTask.data;

import Exceptions.thirdTask.exceptions.DeviceIsOffException;

import java.util.UUID;

public class Device {
    private final String id;
    private boolean isOn;


    public Device() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void ping() throws DeviceIsOffException {
        if (!isOn) {
            throw new DeviceIsOffException(id);
        }
    }
}
