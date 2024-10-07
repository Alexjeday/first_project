package homework4.ex1.car;

public abstract class Car {
    protected Boolean isClear = true;
    protected final double length;
    protected final double height;
    protected final double width;

    public Car(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Car(Boolean isClear, double length, double height, double width) {
        this.isClear = isClear;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void setClear(Boolean clear) {
        isClear = clear;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

