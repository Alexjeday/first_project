package homework4.ex1.car;

public class LightCar extends homework4.ex1.car.Car {
    private final boolean CruiseControl;

    public LightCar(double length, double height, double width, boolean cruiseControl) {
        super(length, height, width);
        CruiseControl = cruiseControl;
    }

    public LightCar(Boolean isClear, double length, double height, double width, boolean cruiseControl) {
        super(isClear, length, height, width);
        CruiseControl = cruiseControl;
    }

    public boolean isCruiseControl() {
        return CruiseControl;
    }
}
