package Exceptions.thirdTask.exceptions;

public class DeviceIsOffException extends Exception{
    private final String id;

    public DeviceIsOffException(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }
}
