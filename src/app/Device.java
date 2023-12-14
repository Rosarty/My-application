package app;

abstract public class Device {
    protected double param1;
    protected double param2;

    public Device(double param1, double param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public abstract double getResult();

}
