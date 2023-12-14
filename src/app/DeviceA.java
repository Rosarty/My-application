package app;

public class DeviceA extends Device {
    public DeviceA(double param1, double param2) {
        super(param1, param2);
    }

    @Override
    public double getResult() {
        return param1 * param2;
    }
}

