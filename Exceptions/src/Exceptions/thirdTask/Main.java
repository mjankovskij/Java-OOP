package Exceptions.thirdTask;

import Exceptions.thirdTask.data.Device;
import Exceptions.thirdTask.data.Display;
import Exceptions.thirdTask.data.Keyboard;
import Exceptions.thirdTask.data.Mouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MonitoringService service = new MonitoringService();

        List<Device> devices = List.of(new Device(), new Mouse(), new Display(), new Keyboard());

        devices.get(1).setOn(true);
        devices.get(2).setOn(true);

        service.pingDevices(devices);
    }
}
