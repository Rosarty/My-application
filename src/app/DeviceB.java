package app;

public class DeviceB extends Device {
    private static final double Сoefficient = 5;

    public DeviceB(double param1, double param2) {
        super(param1, param2);
    }

    @Override
    public double getResult() {
        return (param1 + param2) * Сoefficient;
    }
}
