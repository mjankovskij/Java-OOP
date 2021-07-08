package Exceptions.thirdTask;

import Exceptions.thirdTask.data.Device;
import Exceptions.thirdTask.exceptions.DeviceIsOffException;

import java.util.List;

public class MonitoringService {

    public void pingDevices(List<Device> devices){
        devices.forEach(device -> {
            try {
                device.ping();
                System.out.println("Device is on " + device.getId());
            } catch (DeviceIsOffException e) {
                System.out.println("Device is off " + e.getId());
            }
        });
    }
}
